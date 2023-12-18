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
        double D = scan.nextInt();
        double T = scan.nextInt();
        double S = scan.nextInt();
        double time = D / S;
        if (time <= T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
