import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int[] h = new int[N];
        for (int i=0; i<N; i++) {
            h[i] = Integer.parseInt(scanner.next());
        }
        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(h[1]-h[0]);
        int a = 0;
        int b = 0;
        for (int i=2; i<N; i++) {
            a = dp[i-2] + Math.abs(h[i]-h[i-2]);
            b = dp[i-1] + Math.abs(h[i]-h[i-1]);
            if (a > b) {
                dp[i] = b;
            } else {
              dp[i] = a;  
            }
        }
        System.out.println(dp[N-1]);
    } 
}