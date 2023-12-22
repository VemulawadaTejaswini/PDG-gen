import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
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
        boolean found = true;
        // a1-a2
        if (map[0][0] - map[1][0] != map[0][1] - map[1][1] || map[0][1] - map[1][1] != map[0][2] - map[1][2]) {
            found = false;
        }
        // a2-a3
        if (map[1][0] - map[2][0] != map[1][1] - map[2][1] || map[1][1] - map[2][1] != map[1][2] - map[2][2]) {
            found = false;
        }
        // a3-a1
        if (map[2][0] - map[0][0] != map[2][1] - map[0][1] || map[2][1] - map[0][1] != map[2][2] - map[0][2]) {
            found = false;
        }
        // b1-b2
        if (map[0][0] - map[0][1] != map[1][0] - map[1][1] || map[1][0] - map[1][1] != map[2][0] - map[2][1]) {
            found = false;
        }
        // b2-b3
        if (map[0][1] - map[0][2] != map[1][1] - map[1][2] || map[1][1] - map[1][2] != map[2][1] - map[2][2]) {
            found = false;
        }
        // b3-b1
        if (map[2][2] - map[2][0] != map[1][2] - map[1][0] || map[1][2] - map[1][0] != map[0][2] - map[0][0]) {
            found = false;
        }
        System.out.println(found ? "Yes" : "No");
    }
}
