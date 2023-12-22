import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);

        for (int i=2; i<N; i++) {
            for (int j=i-1; j>=0 && i-j<=K; j--) {
                dp[i] = Math.min(dp[i],dp[j]+Math.abs(arr[i]-arr[j]));
            }
        }
        System.out.println(dp[N-1]);
    }
}
