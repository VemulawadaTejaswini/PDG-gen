import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = N%1000;
        System.out.println(1000-A);

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}