
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 10000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] map = new int[H][W];
        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                map[y][x] = sc.nextInt();
            }
        }
        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                map[y][x] = Math.abs(map[y][x] - sc.nextInt());
            }
        }
        boolean[][][] aval = new boolean[H][W][12800];
        aval[0][0][map[0][0]] = true;
        for (int x = 1; x < W; x++) {
            int y = 0;
            for (int i = 0; i < 12800; i++) {
                if (aval[y][x - 1][i]) {
                    if (i + map[y][x] < 12800)
                        aval[y][x][i + map[y][x]] = true;
                    if (Math.abs(i - map[y][x]) < 12800)
                        aval[y][x][Math.abs(i - map[y][x])] = true;
                }
            }
        }
        for (int y = 1; y < H; y++) {
            int x = 0;
            for (int i = 0; i < 12800; i++) {
                if (aval[y - 1][x][i]) {
                    if (i + map[y][x] < 12800)
                        aval[y][x][i + map[y][x]] = true;
                    if (Math.abs(i - map[y][x]) < 12800)
                        aval[y][x][Math.abs(i - map[y][x])] = true;
                }
            }
        }
        for (int y = 1; y < H; y++) {
            for (int x = 1; x < W; x++) {
                for (int i = 0; i < 12800; i++) {
                    if (aval[y][x - 1][i]) {
                        if (i + map[y][x] < 12800)
                            aval[y][x][i + map[y][x]] = true;
                        if (Math.abs(i - map[y][x]) < 12800)
                            aval[y][x][Math.abs(i - map[y][x])] = true;
                    }
                }
                for (int i = 0; i < 12800; i++) {
                    if (aval[y - 1][x][i]) {
                        if (i + map[y][x] < 12800)
                            aval[y][x][i + map[y][x]] = true;
                        if (Math.abs(i - map[y][x]) < 12800)
                            aval[y][x][Math.abs(i - map[y][x])] = true;
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 12800; i++) {
            if (aval[H - 1][W - 1][i]) {
                System.out.println(i);
                return;
            }
        }
        // for (int y = 0; y < H; y++) {
        // for (int x = 0; x < W; x++) {
        // System.out.print(Arrays.toString(aval.get(y).get(x).toArray()) + " ");
        // }
        // System.out.println();
        // }
    }
}