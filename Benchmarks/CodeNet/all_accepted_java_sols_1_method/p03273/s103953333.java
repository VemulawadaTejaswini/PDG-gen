import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int row_H = Integer.parseInt(scan.next());
        int col_W = Integer.parseInt(scan.next());


        String[] a = new String[row_H];
        for (int i = 0; i < row_H; i++) {
            a[i] = scan.next();
        }


        boolean[] row = new boolean[row_H];
        Arrays.fill(row, false);
        boolean[] col = new boolean[col_W];
        Arrays.fill(col, false);

        for (int i = 0; i < row_H; i++) {
            for (int j = 0; j < col_W; j++) {
                if (a[i].charAt(j) == '#') {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < row_H; i++) {
            if (row[i]) {
                for (int j = 0; j < col_W; j++) {
                    if (col[j]) {
                        System.out.print(a[i].charAt(j));
                    }
                }
                System.out.println();
            }
        }
    }
}