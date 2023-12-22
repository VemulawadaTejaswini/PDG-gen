
import java.util.Scanner;


public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long mod = 1000000007L;
        int n = s.length();
        long [][] number = new long[n + 1][13];
        number[0][0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) == '?') {
                for (int j = 0; j <= 9; ++j) {
                    for (int k = 0; k <= 12; ++k) {
                        if (number[i - 1][k] > 0) {
                            int currentMod = ( k * 10 + j  + 13) % 13;
                            number[i][currentMod] += number[i - 1][k];
                            number[i][currentMod] %= mod;
                        }
                    }
                }
            } else {
                int current = s.charAt(i - 1) - '0';
                for (int k = 0; k <= 12; ++k) {
                    int currentMod = ( k * 10 + current  + 13) % 13;
                    number[i][currentMod] += number[i - 1][k];
                    number[i][currentMod] %= mod;
                }
            }

        }
        System.out.println(number[n][5]);

    }
}
