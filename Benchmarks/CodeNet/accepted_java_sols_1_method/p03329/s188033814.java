import java.io.*;

class Main{
    static int[] dp = new int[100010];
    public static void main(String[] args) throws IOException{
        dp[0] = 0;
        int aom;
        for (int i=1;i<=100_000;i++){
            aom = 1;
            dp[i] = Integer.MAX_VALUE;
            while (aom<=i){
                dp[i] = Math.min(dp[i],dp[i-aom]+1);
                aom *= 6;
            }
            aom = 1;
            while (aom<=i){
                dp[i] = Math.min(dp[i],dp[i-aom]+1);
                aom *= 9;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        System.out.println(dp[N]);
    }
}