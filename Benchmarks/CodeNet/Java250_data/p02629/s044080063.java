import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        c(N);
    }
    public void c(long N) {
        StringBuilder sb = new StringBuilder();
        while(0 < N) {
            N -= 1;
            int mod = (int) (N % 26);
            sb.append((char)(mod + (int)'a'));
            N /= 26;
        }
        System.out.println(sb.reverse().toString());
    }
}
