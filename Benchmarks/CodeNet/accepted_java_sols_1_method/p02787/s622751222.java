import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int H = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            A[i] = Integer.parseInt(st.nextToken());;
            B[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[H+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= H; i++) {
            for (int j = 0; j < N; j++) {
                if (A[j] > i) {
                    dp[i] = Math.min(dp[i], B[j]);
                } else {
                    dp[i] = Math.min(dp[i], dp[i - A[j]] + B[j]);
                }
            }
        }

        System.out.println(dp[H]);
    }

}