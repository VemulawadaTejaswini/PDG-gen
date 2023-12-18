import java.util.Scanner;

public class Main {

    public static int q, i, n;
    public static int[] A;
    public static int[] m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        q = sc.nextInt();
        m = new int[q];
        for (i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }
        for (i = 0; i < q; i++) {
            if (solve(0, m[i])) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean solve(int i, int m) {
        if (m == 0) {
            return true;
        }
        if (i >= n) {
            return false;
        }

        boolean res = solve(i + 1, m) || solve(i + 1, m - A[i]);

        return res;
    }
}
