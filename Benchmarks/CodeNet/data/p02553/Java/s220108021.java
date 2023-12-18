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
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();
        long ans = a * c;
        ans = Math.max(ans, a*d);
        ans = Math.max(ans, b*c);
        ans = Math.max(ans, b*d);
        System.out.println(ans);
    }
}
