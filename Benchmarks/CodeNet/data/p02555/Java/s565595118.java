
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    static long dp[][];
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int S=gi();
        int mb=Math.floorDiv(S, 3);
        dp = new long [S+1][mb+1];

        for(int i=3; i<S+1; i++) {
        	dp[i][1]=1;
        }
        for (int i=4; i<S+1; i++) {
        	for (int j=2; j<mb+1; j++) {
            	dp[i][j]+=(dp[i-3][j-1] + dp[i-1][j]) % 1000000007;
            }
        }

        long ans = 0;
        for(int i=0; i<mb+1; i++) {
        	ans+=dp[S][i];
        }
        System.out.println(ans%1000000007);
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}