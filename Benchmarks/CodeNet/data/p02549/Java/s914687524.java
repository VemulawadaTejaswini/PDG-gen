import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Set<Integer> checkSet = new HashSet<>();

        for(int i = 0; i < K; i++) {
            String[] input_array = br.readLine().split(" ");
            int min = Integer.parseInt(input_array[0]);
            int max = Integer.parseInt(input_array[1]);

            for(int j = min; j <= max; j++) checkSet.add(j);
        }
        
        int[] dp = new int[N + 10];
        dp[1] = 1;

        for(int i = 2; i <= N; i++) {    
            
            for(Integer num : checkSet) {
                if(i - num <= 0) continue;
                dp[i] += dp[i-num];
                dp[i] %= 998244353;
            }

        }
        
        pw.println(dp[N]);
        br.close();
        pw.close();
    }
}