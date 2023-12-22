import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class Main {

    static final int modnum = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        boolean[][] wall = new boolean[H][W];

        int[][] gyo = new int[H][W];
        int[][] retu = new int[H][W];

        for (int h = 0; h < H; h++) {
            String line = sc.nextLine();
            for (int w = 0; w < W; w++) {
                wall[h][w] = line.charAt(w) == '#' ? true : false;
            }
        }
        // for (int h = 0; h < H; h++) {
        // for (int w = 0; w < W; w++) {
        // System.out.print(wall[h][w] ? '#':'.');
        // }
        // System.out.println();
        // }

        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if (wall[h][w] == false) {
                    if (gyo[h][w] == 0) {
                        int tmp;
                        tmp = 0;
                        int tw = w;
                        while (tw < W && !wall[h][tw]) {
                            tmp++;
                            tw++;
                        }
                        while (w < tw) {
                            gyo[h][w] = tmp;
                            w++;
                        }
                    }
                }
            }
        }
        for (int w = 0; w < W; w++) {
            for (int h = 0; h < H; h++) {
                if (wall[h][w] == false) {
                    if (retu[h][w] == 0) {
                        int tmp;
                        tmp = 0;
                        int th = h;
                        while (th < H && !wall[th][w]) {
                            tmp++;
                            th++;
                        }
                        while (h < th) {
                            retu[h][w] = tmp;
                            h++;
                        }
                    }
                }
            }
        }

        long ans = 0;
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                ans = Math.max(ans, gyo[h][w] + retu[h][w]-1);
            }
        }
        System.out.println(ans);
    }
}