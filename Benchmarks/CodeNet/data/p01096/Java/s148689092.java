import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static long N;
    static int M;
    static int A;
    static long B;
    static long C;
    static int[] map = new int[1000000];
    static int min = 9999999;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int N = scanner.nextInt();
            if(N == 0)break;
            int[] A = new int[N];
            int[][] dp = new int[N][N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            for (int w = 1; w < N; w++) {
                for (int i = 0; i < N - w; i++) {
                    int j = i + w;
                    int max = 0;

                    for (int k = i; k <= j - 1; k++) {
                        max = Math.max(max, dp[i][k] + dp[k + 1][j]);
                    }

                    if(Math.abs(A[i] - A[j]) <= 1 && w % 2 == 1 && dp[i + 1][j - 1] == w - 1){
                        max = w + 1;
                    }
                    dp[i][j] = max;
                }
            }

            System.out.println(dp[0][N - 1]);

        }




    }
}


