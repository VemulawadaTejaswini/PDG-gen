import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[] hBombCount = new int[h];
        int[] wBombCount = new int[w];
        int[][] bomb = new int[h][w];
        for (int i = 0; i < m; i++) {
            int mh = sc.nextInt() - 1;
            int mw = sc.nextInt() - 1;
            bomb[mh][mw] = 1;
            hBombCount[mh]++;
            wBombCount[mw]++;
        }

        int maxH = 0;
        int maxW = 0;
        int tmpH = 0;
        int tmpW = 0;
        for (int i = 0; i < h; i++) {
            if (maxH < hBombCount[i]) {
                maxH = hBombCount[i];
                tmpH = i;
            }
        }
        for (int i = 0; i < w; i++) {
            if (maxW < wBombCount[i]) {
                maxW = wBombCount[i];
                tmpW = i;
            }
        }

        boolean max = false;
        for (int i = tmpH; i < h; i++) {
            if (hBombCount[i] < maxH) continue;

            for (int j = tmpW; j < w; j++) {
                if (wBombCount[j] < maxW) continue;

                if (bomb[i][j] == 0) {
                    max = true;
                }
            }
        }
        if (max) System.out.println(maxH + maxW);
        else System.out.println(maxH + maxW - 1);
    }
}