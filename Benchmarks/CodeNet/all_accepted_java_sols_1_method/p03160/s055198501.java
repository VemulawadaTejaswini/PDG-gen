import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        for(int i= 1;i<N;i++) dp[i]= Integer.MAX_VALUE;
        dp[0] = 0;
        for(int i = 0;i<N-1;i++){
            if(i+1<N){
                dp[i+1] =Math.min(dp[i+1] ,dp[i] + Math.abs(arr[i+1] - arr[i]));
            }
            if(i+2<N){
                dp[i+2] =Math.min(dp[i+2] ,dp[i]+ Math.abs(arr[i+2] - arr[i]));
            }
        }
        System.out.println(dp[N-1]);
    }
}
