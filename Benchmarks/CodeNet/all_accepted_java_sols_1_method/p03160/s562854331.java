import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        if(n==1)
            System.out.println(0);

        int dp[] = new int[n];

        dp[0] = 0;
        dp[1] = Math.abs(a[0]-a[1]);

        for(int i=2; i<n; i++) {
            dp[i] = Math.min(Math.abs(a[i]-a[i-1]) + dp[i-1],Math.abs(a[i]-a[i-2]) + dp[i-2]);
        }
        System.out.println(dp[n-1]);
    }

}
