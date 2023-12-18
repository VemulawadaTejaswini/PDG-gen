import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long A = scan.nextLong();
        String b = scan.next();
        StringBuilder sb = new StringBuilder();
        char[] d = b.toCharArray();
        int len = b.length();
        for (int i = 0; i < len; i++) {
            if (d[i] == '.') {
                continue;
            }
            sb.append(d[i]);
        }
        long B = Long.valueOf(sb.toString());

        long ans = A * B / 100;
        System.out.println(ans);
    }
}
