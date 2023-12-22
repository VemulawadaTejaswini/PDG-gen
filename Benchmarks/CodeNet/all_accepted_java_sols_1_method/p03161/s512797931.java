import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int N =sc.nextInt();
            int K= sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int[] dp = new int[N];
            for(int i= 1;i<N;i++) dp[i]= Integer.MAX_VALUE;
            dp[0] = 0;
            for(int i = 0;i<N-1;i++){
                int j = 1;
                while(j < K+1 && (i+j)< N){
                    dp[i+j] =Math.min(dp[i+j] ,dp[i] + Math.abs(arr[i+j] - arr[i]));
                    j++;
                }
            }
            System.out.println(dp[N-1]);
        }
    }
}
