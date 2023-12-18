import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String line = scan.next();
            char[] data = line.toCharArray();
            for (int j = 0; j < W; j++) {
                map[i][j] = data[j];
            }
        }
        int[][] horizonL = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '#') {
                    horizonL[i][j] = j+1;
                    continue;
                }
                if (0 < j) {
                    horizonL[i][j] = horizonL[i][j-1];
                }
            }
        }
        int[][] horizonR = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = W - 1; 0 <= j; j--) {
                if (map[i][j] == '#') {
                    horizonR[i][j] = j+1;
                    continue;
                }
                if (j < W - 1) {
                    horizonR[i][j] = horizonR[i][j+1];
                } else {
                    horizonR[i][j] = W+1;
                }
            }
        }
        int[][] verticalT = new int[H][W];
        for (int j = 0; j < W; j++) {
            for (int i = 0; i < H; i++) {
                if (map[i][j] == '#') {
                    verticalT[i][j] = i+1;
                    continue;
                }
                if (0 < i) {
                    verticalT[i][j] = verticalT[i-1][j];
                }
            }
        }
        int[][] verticalB = new int[H][W];
        for (int j = 0; j < W; j++) {
            for (int i = H-1; 0 <= i; i--) {
                if (map[i][j] == '#') {
                    verticalB[i][j] = i+1;
                    continue;
                }
                if (i < H - 1) {
                    verticalB[i][j] = verticalB[i+1][j];
                } else {
                    verticalB[i][j] = H+1;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '#') {
                    continue;
                }
                int count = horizonR[i][j]-horizonL[i][j]-1;
                count += verticalB[i][j]-verticalT[i][j]-1;
                count -= 1;
                answer = Math.max(answer, count);
            }
        }
        System.out.println(answer);
    }
}
