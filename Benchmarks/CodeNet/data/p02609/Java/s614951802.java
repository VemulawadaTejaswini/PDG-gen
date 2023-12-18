import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner sc, PrintWriter pw) {
        int n = sc.nextInt();
        String x = sc.next();
        if (n == 1) {
            if ("0".equals(x)) {
                pw.println(1);
            } else {
                pw.println(0);
            }
        }
        int totalOne = 0;
        for (int i = 0; i < n; i++) {
            totalOne += x.charAt(i) == '1' ? 1 : 0;
        }
        long[] totalOneMinus1 = new long[n + 1];
        long[] totalOnePlus1 = new long[n + 1];
        totalOneMinus1[0] = totalOnePlus1[0] = 1;
        for (int i = 1; i < n; i++) {
            totalOneMinus1[i] = totalOneMinus1[i - 1] * 2L % (totalOne - 1);
            totalOnePlus1[i] = totalOnePlus1[i - 1] * 2L % (totalOne + 1);
        }

        long remainderMinus1 = 0;
        long remainderPlus1 = 0;
        for (int i = 0; i < n; i++) {
            int index = n - 1 - i;
            if (x.charAt(index) == '1') {
                remainderMinus1 = (remainderMinus1 + totalOneMinus1[i]) % (totalOne - 1);
                remainderPlus1 = (remainderPlus1 + totalOnePlus1[i]) % (totalOne + 1);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = n - 1 - i;
            // 1 -> 0
            long total;
            if (x.charAt(index) == '1') {
                total = (remainderMinus1 - totalOneMinus1[i] + (totalOne - 1)) % (totalOne - 1);
            } else {
                total = (remainderPlus1 + totalOnePlus1[i] + (totalOne + 1)) % (totalOne + 1);
            }
            pw.println(func(total) + 1);
        }
    }

    private long func(long total) {
        if (total == 0) {
            return 0;
        }
        return 1 + func(total % Long.bitCount(total));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}
