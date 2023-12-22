import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lo =reader.readLine().split(" ");
        int N=Integer.parseInt(lo[0]);
        int K = Integer.parseInt(lo[1]);
        String[] lop = reader.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(lop[i]);
        }
        int[] dp = new int[N];
        dp[0] = 0;
        for (int i = 1; i <N ; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(j<=K && i-j>=0){
                min = Math.min(min,dp[i-j]+Math.abs(arr[i]-arr[i-j]));
                j++;
            }
            dp[i] = min;
        }
        System.out.println(dp[N-1]);
    }
}
