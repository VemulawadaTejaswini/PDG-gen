import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static int[] A;
    static int[] use;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = new int[n];
        use = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sumCombination();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            if (set.contains(sc.nextInt())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }


    }

    static void sumCombination() {
        int i = 0;
        rec(i);
    }

    static void rec(int i) {
        if (i == use.length) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (use[j] == 1) {
                    sum += A[j];
                }
            }
            set.add(sum);
            return;
        }
        use[i] = 1;
        rec(i + 1);
        use[i] = 0;
        rec(i + 1);
    }
}