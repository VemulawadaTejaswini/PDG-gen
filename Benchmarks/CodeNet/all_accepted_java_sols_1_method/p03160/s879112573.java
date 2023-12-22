import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] h = new int[n];
        String line = br.readLine();
        String[] parts = line.split(" ");
        for(int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(parts[i]);
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for(int i = 2; i < n; i++) {
            for(int j = 1; j <= 2; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
            }
        }
        System.out.println(dp[n - 1]);
    }
}
