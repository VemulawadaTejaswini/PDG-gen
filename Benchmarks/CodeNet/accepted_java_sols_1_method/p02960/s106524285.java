import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        String v = scan.next();
        int[] dp = new int[13];
        int[] nx = new int[13];

        dp[0]= 1;
        for (int i = 0; i < v.length(); i++) {
            Arrays.fill(nx,0);
            for (int j = 0; j < 13; j++) {
                for (int k = 0; k < 10; k++) {
                    if(k == v.charAt(i)-'0' || v.charAt(i) == '?') {
                        nx[(j * 10 + k) % 13] = (nx[(j * 10 + k) % 13] + dp[j])%mod;
                    }
                }
            }

            for (int j = 0; j < 13; j++) {
                dp[j] = nx[j];
            }
        }

        System.out.println(dp[5]);

    }
}
