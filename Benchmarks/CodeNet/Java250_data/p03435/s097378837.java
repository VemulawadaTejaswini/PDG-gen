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
        int[][] map = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = scan.nextInt();
            }
        }
        // a1+b1 a1+b2 a1+b3
        // a2+b1 a2+b2 a2+b3
        // a3+b1 a3+b2 a3+b3
        boolean found = true;
        int b1 = map[0][0];
        int b2 = map[0][1];
        int b3 = map[0][2];
        int a1 = 0;
        int a2 = map[1][0]-b1;
        int a3 = map[2][0]-b1;
        if (map[1][1] != a2 + b2 || map[1][2] != a2 + b3 || map[2][1] != a3 + b2 || map[2][2] != a3 + b3) {
            found = false;
        }
        System.out.println(found ? "Yes" : "No");
    }
}
