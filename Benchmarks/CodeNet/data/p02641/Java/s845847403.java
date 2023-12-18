import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i=0; i<N; i++) {
            p[i] = sc.nextInt();
        }

        System.out.println(solve(X, N, p));
    }

    private static int solve(int X, int N, int[] p) {
        int count = 0;


        for (int d=0; d<=50; d++) {
            boolean find = false;
            int x = X-d;
            for (int i=0; i<N; i++) {
                if (x == p[i]) {
                    find = true;
                    break;
                }
            }
            if (!find) return x;

            x = X+d;
            find = false;
            for (int i=0; i<N; i++) {
                if (x == p[i]) {
                    find = true;
                    break;
                }
            }
            if (!find) return x;
        }

        return count;
    }
}