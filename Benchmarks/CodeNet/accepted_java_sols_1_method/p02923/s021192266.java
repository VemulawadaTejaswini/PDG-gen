import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[]arr = new long [n];
        for(int i  = 0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        int[]dp = new int[n];
        dp[n-1] = 0;
        int max = 0;
        for(int i = n-2;i>=0;i--)
        {
            dp[i] = arr[i]>=arr[i+1] ? dp[i+1]+1 :0;
            max = Math.max(dp[i] , max);
        }
        System.out.println(max);
    }
}
