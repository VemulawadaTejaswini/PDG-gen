import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= N ; i++) {

            if(i==2){
                dp[i]=dp[i-1] + Math.abs(arr[i-1]-arr[i-2]);
            }else{
                dp[i]= Math.min(
                        dp[i-1] + Math.abs(arr[i-1]-arr[i-2]),
                        dp[i-2] + Math.abs(arr[i-1]-arr[i-3])
                );
            }

        }
        System.out.println(dp[N]);


    }
}