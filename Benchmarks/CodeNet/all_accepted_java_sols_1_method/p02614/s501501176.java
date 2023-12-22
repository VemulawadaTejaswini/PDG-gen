import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // input
            int H = Integer.parseInt(sc.next());
            int W = Integer.parseInt(sc.next());
            int K = Integer.parseInt(sc.next());
            char[][] c = new char[H][W];
            int total = 0;
            for (int i = 0; i < H; i++) {
                c[i] = sc.next().toCharArray();
                for (char ch : c[i]) {
                    if (ch == '#') total++;
                }
            }

            // calc
            int ans = 0;
            for (int hi = 0; hi < Math.pow(2, H); hi++) {
                for (int wi = 0; wi < Math.pow(2, W); wi++) {
                    char[][] tmp = new char[H][W];
                    // H
                    for (int i = 0; i < H; i++) {
                        if ((1&hi >>> i) == 1) {
                            tmp[i] = c[i];
                        }
                    }
                    // W
                    for (int j = 0; j < W; j++){
                        if ((1&wi >>> j) == 1) {
                            for (int i = 0; i < H; i++) {
                                tmp[i][j] = c[i][j];
                            }
                        }
                    }
                    // calc
                    int cnt = 0;
                    for (int i = 0; i < H; i++) {
                        for (int j = 0; j < W; j++) {
                            if (tmp[i][j] == '#') cnt++;
                        }
                    }
                    if ((total - K) == cnt) ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
