import java.util.Arrays;

class Main {
    public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int[] coin = new int [M+1];
        for(int i=1; i<M+1; i++){
            coin[i] = Integer.parseInt(sc.next());
        }
        int[][] dp = new int[M+1][N+1];
        Arrays.fill(dp[0], Integer.MAX_VALUE/2);
        for(int mi=0; mi<M+1; mi++){
            dp[mi][0] = 0;
        }
        for(int mi=1; mi<M+1; mi++){
            for(int ni=0; ni<N+1; ni++){
                if(ni-coin[mi]>=0){
                    dp[mi][ni] = Math.min(dp[mi-1][ni], dp[mi][ni-coin[mi]]+1);
                } else {
                    dp[mi][ni] = dp[mi-1][ni];
                }
                //miのコインを使わなかったとき, miのコインを使ったとき
            }
        }
        System.out.println(dp[M][N]);
        sc.close();
    }
}
