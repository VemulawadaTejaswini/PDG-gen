import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[][] sheet = new int[r+1][c+1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sheet[i][j] = Integer.parseInt(sc.next());
                sheet[i][c] += sheet[i][j];
                sheet[r][j] += sheet[i][j];
                sheet[r][c] += sheet[i][j];
            }
        }
        for (int i = 0; i < r+1; i++) {
            String ans = "";
            for (int j = 0; j < c+1; j++) {
                if (j != 0) {
                    ans += " ";
                }
                ans += String.valueOf(sheet[i][j]);
            }
            out.printf("%s\n", ans);
        }
        out.flush();
    }
}
