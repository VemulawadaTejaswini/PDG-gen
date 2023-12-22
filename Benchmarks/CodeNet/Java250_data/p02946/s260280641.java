import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();

        for (int i = X - K + 1; i <= X + K -1 ; i++) {
            System.out.print(i + " ");
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}