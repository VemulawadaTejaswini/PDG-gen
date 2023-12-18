import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] V = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] C = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] vc = new int[N];
        for(int i=0; i<N; i++){
            vc[i] = V[i] - C[i];
        }
        int[] dp = new int[N+1];
        dp[0] = 0;
        for(int i=0; i<N; i++){
            dp[i+1] = Math.max(dp[i], dp[i] + vc[i]);
        }
        System.out.println(dp[N]);
    }
}
