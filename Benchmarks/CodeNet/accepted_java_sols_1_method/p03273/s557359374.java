import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] a = new String[h];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next();
        }
        List<Integer> whiteRow = new ArrayList<Integer>();
        for (int i = 0; i < h; i++) {
            int row = 0;
            for (int j = 0; j < w; j++) {
                if (a[i].charAt(j) == '.') {
                    row++;
                    if (row == w) {
                        whiteRow.add(i);
                    }
                }
            }
        }
        List<Integer> whiteCol = new ArrayList<Integer>();
        for (int i = 0; i < w; i++) {
            int col = 0;
            for (int j = 0; j < h; j++) {
                if (a[j].charAt(i) == '.') {
                    col++;
                    if (col == h) {
                        whiteCol.add(i);
                    }
                }
            }
        }
        for (int i = 0; i < h; i++) {
            if (whiteRow.contains(i)) {
                continue;
            }
            for (int j = 0; j < w; j++) {
                if (whiteCol.contains(j)) {
                    continue;
                }
                System.out.print(a[i].charAt(j));
            }
            System.out.print("\n");
        }
    }

}
