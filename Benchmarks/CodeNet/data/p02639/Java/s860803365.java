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
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (A[i] == 0) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
