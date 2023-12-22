import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] board = new int[H + 2][W + 2];
        for (int i = 0; i < H; i++) {
            char[] f = sc.next().toCharArray();
            for (int l = 0; l < W; l++)
                board[i + 1][l + 1] = f[l] == '#' ? -1 : 0;
        }
        int[][] round = { { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 } };
        for (int y = 1; y <= H; y++) {
            for (int x = 1; x <= W; x++) {
                if(board[y][x]==-1)continue;
                int cnt = 0;
                for (int k = 0; k < 8; k++) {
                    if (board[y + round[k][0]][x + round[k][1]] == -1)
                        cnt++;
                }
                board[y][x] = cnt;
            }
        }
        for (int y = 1; y <= H; y++) {
            for (int x = 1; x <= W; x++) {
                if (board[y][x] == -1) {
                    System.out.print('#');
                } else {
                    System.out.print(board[y][x]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
