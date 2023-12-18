import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        // int[] dp = new int[N + 10];
        // dp[2] = 1;
        
        int ans = 0;

        for(int i = 1; i < N; i++) {
            int target = N - i;
            
            for(int j = 1; j * j <= target; j++) {
                if(target % j == 0) {
                    if(j == (target / j)) {
                        ans += 1;
                    } else {
                        ans += 2;
                    }
                }
            }
        }
        
        pw.println(ans);
        br.close();
        pw.close();
    }
}