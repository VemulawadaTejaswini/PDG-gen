import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = solve(N, A);
        for (int i=0; i<N; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(ans[i]);
        }
        System.out.println();

    }

    private static int[] solve(int N, int[] A) {
        int[] ans = new int[N];
        int max = A[0];
        for (int i=0; i<N; i++) {
            max = Math.max(max, A[i]);
        }

        int keta;
        for (keta=1; ; keta++) {
            if (max < Math.pow(2, keta)) {
                break;
            }
        }
        int[] count = new int[keta];
        for (int i=0; i<N; i++) {
            int a = A[i];

            for (int idx=0; a>0; idx++) {
                count[idx] += a%2;
                a /= 2;
            }
        }

        /*
        for (int i=0; i<count.length; i++) {
            System.err.println(count[i]);
        }
         */

        for (int i=0; i<N; i++) {
            int a = A[i];
            int val = 1;

            for(int k=0; k<keta; k++) {
                if(count[k]%2 == 0 && a%2 == 1 || count[k]%2 == 1 && a%2 == 0) {
                    ans[i] += val;
                }
                val *= 2;
                a /= 2;
            }
        }

        return ans;
    }
}