import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(input.readLine());
        int N = Integer.parseInt(st.nextToken());
      	int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(input.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<N; i++){
          for(int k = 1; k<K+1; k++){
            if(i+k<N) dp[i+k] = Math.min(dp[i+k], dp[i] + Math.abs(arr[i] - arr[i+k]));
          }
        }
        output.println(dp[N-1]);
      	output.close();
    }
}