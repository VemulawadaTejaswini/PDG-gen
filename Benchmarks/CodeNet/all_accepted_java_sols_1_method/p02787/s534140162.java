import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A  = new int[N];
        int[] B  = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        int[] dp = new int[H+1];


        for(int i=0;i<H+1;i++){
                dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        for(int i=0;i<H+1;i++){
            for(int j=0;j<N;j++){
                if(A[j] >= i ){
                    dp[i] = Math.min(dp[i],B[j]);
                } else {
                    dp[i] = Math.min(dp[i-A[j]]+B[j],dp[i]);
                }
            }
        }
        System.out.println(dp[H]);

    }

}




