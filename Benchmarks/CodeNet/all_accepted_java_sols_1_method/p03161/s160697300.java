import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ;++i){
            arr[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        for(int i = 1 ; i<=k&&i<n;++i){
            dp[i] = Math.abs(arr[i]-arr[0]);
        }
        for(int i=k+1 ; i<n;++i){
            int minValue = Integer.MAX_VALUE;
            for(int j = k ; j>0 ; --j){
                int temp =dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                if(temp<minValue){
                    minValue = temp;
                }
            }
            dp[i] = minValue;
        }
        System.out.println(dp[n-1]);
    }
}
