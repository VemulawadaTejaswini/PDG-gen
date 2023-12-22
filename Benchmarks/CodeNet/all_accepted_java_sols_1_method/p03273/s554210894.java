import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] a = new String[h][w];
        int[] counth = new int[w];// 一列ごとの.の個数
        Arrays.fill(counth, 0);
        int[] countw = new int[h];// 一行ごとの.の個数
        Arrays.fill(counth, 0);
        for (int i = 0; i < h; i++) {
            a[i][0] = sc.next();
        }
        for (int i = 0; i < h; i++) {
            a[i] = a[i][0].split("");
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j].equals("."))
                    countw[i]++;
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (a[j][i].equals("."))
                    counth[i]++;
            }
        }
        for (int i = 0; i < h; i++) {
            if (countw[i] == w) {

            } else {
                for (int j = 0; j < w; j++) {
                    if (counth[j] == h) {

                    } else {
                        System.out.print(a[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}