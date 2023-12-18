import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    int MOD = 1_000_000_007;

    void solve(Scanner sc, PrintWriter pw) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int zeroCount = 0;
        long totalProduct = 1L;
        for (int i = 0; i < N; i++) {
            int data = sc.nextInt();
            if (data == 0) {
                zeroCount++;
            } else if (data > 0) {
                positive.add(data);
                totalProduct = (totalProduct * data) % MOD;
            } else {
                negative.add(data);
                totalProduct = (totalProduct * data) % MOD;
            }
        }
        if (K % 2 == 0) {
            int positiveUsable = getEven(positive.size()) + getEven(negative.size());
            if (positiveUsable >= K) {
                List<Integer> total = new ArrayList<>();
                positive.sort(Comparator.reverseOrder());
                Collections.sort(negative);
                total.addAll(positive.subList(0, getEven(positive.size())));
                int negativeSize = getEven(negative.size());
                for (int j = 0; j < negativeSize; j++) {
                    total.add(-1 * negative.get(j));
                }
                total.sort(Collections.reverseOrder());
                long result = 1;
                for (int i = 0; i < K; i++) {
                    result = (result * total.get(i)) % MOD;
                }
                pw.println(result);
            } else {
                if (zeroCount > 0) {
                    pw.println("0");
                } else {
                    List<Integer> total = new ArrayList<>();
                    Collections.sort(positive);
                    negative.sort(Comparator.reverseOrder());
                    int pSize = getOdd(positive.size());
                    if (pSize >= 0) {
                        total.addAll(positive.subList(0, pSize));
                    }
                    int negativeSize = getOdd(negative.size());
                    for (int j = 0; j < negativeSize; j++) {
                        total.add(-1 * negative.get(j));
                    }
                    Collections.sort(total);
                    long result = -1;
                    for (int i = 0; i < K; i++) {
                        result = (result * total.get(i)) % MOD;
                    }
                    pw.println((result + MOD) % MOD);
                }
            }
        } else {
            int positiveUsable = getOdd(positive.size()) + getEven(negative.size());
            if (getOdd(positive.size()) >= 0 && positiveUsable >= K) {
                List<Integer> total = new ArrayList<>();
                positive.sort(Comparator.reverseOrder());
                Collections.sort(negative);
                int positiveSize = getOdd(positive.size());
                if (positiveSize > 0) {
                    total.addAll(positive.subList(0, positiveSize));
                }
                int negativeSize = getEven(negative.size());
                for (int j = 0; j < negativeSize; j++) {
                    total.add(-1 * negative.get(j));
                }
                total.sort(Collections.reverseOrder());
                long result = 1;
                for (int i = 0; i < K; i++) {
                    result = (result * total.get(i)) % MOD;
                }
                pw.println((result + MOD) % MOD);
            } else {
                if (zeroCount > 0) {
                    pw.println("0");
                } else {
                    List<Integer> total = new ArrayList<>();
                    Collections.sort(positive);
                    negative.sort(Comparator.reverseOrder());
                    total.addAll(positive.subList(0, getEven(positive.size())));
                    int negativeSize = getOdd(negative.size());
                    for (int j = 0; j < negativeSize; j++) {
                        total.add(-1 * negative.get(j));
                    }
                    Collections.sort(total);
                    long result = -1;
                    for (int i = 0; i < K; i++) {
                        result = (result * total.get(i)) % MOD;
                    }
                    pw.println((result + MOD) % MOD);
                }
                List<Integer> total = new ArrayList<>();
                Collections.sort(positive);
                negative.sort(Comparator.reverseOrder());
                total.addAll(positive.subList(0, getEven(positive.size())));
                int negativeSize = getOdd(negative.size());
                for (int j = 0; j < negativeSize; j++) {
                    total.add(-1 * negative.get(j));
                }
                Collections.sort(total);
                long result = -1;
                for (int i = 0; i < K; i++) {
                    result = (result * total.get(i)) % MOD;
                }
                pw.println((result + MOD) % MOD);
            }
        }
    }

    private int getEven(int size) {
        return size - (size % 2);
    }

    private int getOdd(int size) {
        if (size == 0) {
            return -1;
        }
        return size - ((size % 2) == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}
