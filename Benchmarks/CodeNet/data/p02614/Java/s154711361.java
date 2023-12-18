import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int K = scan.nextInt();
        int[][] blacks = new int[H][W];
        for (int i = 0; i < H; i++) {
            char[] t = scan.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if (t[j] == '#') {
                    blacks[i][j] = 1;
                }
            }
        }
        int max = pow(2, H + W);
        int ans = 0;
        for (int t = 0; t < max; t++) {
            int current = t;
            HashSet<Integer> selectedRow = new HashSet<>();
            HashSet<Integer> selectedColumn = new HashSet<>();
            for (int i = 0; i < H + W && 0 < current; i++) {
                if (current % 2 == 0) {
                    current /= 2;
                    continue;
                }
                if (i < H) {
                    selectedRow.add(i);
                    current /= 2;
                    continue;
                }
                selectedColumn.add(i - H);
                current /= 2;
            }
            int count = 0;
            for (int i = 0; i < H; i++) {
                if (selectedRow.contains(i)) {
                    continue;
                }
                for (int j = 0; j < W; j++) {
                    if (selectedColumn.contains(j)) {
                        continue;
                    }
                    count += blacks[i][j];
                }
            }
            if (count == K) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
    private int pow(int base, int count) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            return base * pow(base, count - 1);
        }
        int t = pow(base, count / 2);
        return t * t;
    }
}
