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
        String s = scan.next();
        if (s.endsWith("s")) {
            s = s + "es";            
        } else {
            s = s + "s";
        }
        System.out.println(s);
    }
}
