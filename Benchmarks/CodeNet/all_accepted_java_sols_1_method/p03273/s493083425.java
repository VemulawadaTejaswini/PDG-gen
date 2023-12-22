import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int h, w;
        char[][] mat;
        boolean[] rowVisible, colVisible;
        // 読み込み
        try(Scanner sn = new Scanner(System.in)) {
            h = sn.nextInt();
            w = sn.nextInt();
            mat = new char[h][w];
            rowVisible = new boolean[h];
            colVisible = new boolean[w];
            for (int i = 0; i < h; i++) {
                String row = sn.next();
                for (int j = 0; j < w; j++) {
                    mat[i][j] = row.charAt(j);
                    if (mat[i][j] == '#') {
                        rowVisible[i] = true;
                        colVisible[j] = true;
                    }
                }
            }
        }
        // 表示
        for (int i = 0; i < h; i++) {
            if (!rowVisible[i]) continue;
            for (int j = 0; j < w; j++) {
                if (!colVisible[j]) continue;
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
