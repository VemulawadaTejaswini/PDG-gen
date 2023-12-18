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
        long A = scan.nextInt();
        long V = scan.nextInt();
        long B = scan.nextInt();
        long W = scan.nextInt();
        long T = scan.nextInt();
        long diff = Math.abs(A-B);
        long speed = V - W;
        if (speed <= 0) {
            System.out.println("NO");
            return;
        }
        long time = diff / speed;
        if (diff % speed != 0) {
            time += 1;
        }
        String ans = time <= T ? "YES" : "NO";
        System.out.println(ans);
    }
}
