import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String t = scan.next();
        char[] d = t.toCharArray();
        int ans = 0;
        for (int i = 0; i < d.length; i++) {
            ans += ((int) (d[i] - '0')) % 9;
            ans %= 9;
        }
        if (ans == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
