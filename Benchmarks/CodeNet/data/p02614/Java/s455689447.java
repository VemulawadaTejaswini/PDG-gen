import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = nextInt(scanner);
        int w = nextInt(scanner);
        int k = nextInt(scanner);

        char[][] c = new char[h][w];



        for (int i = 0; i < h; i++) {
            String row = scanner.next();
            int ccount = 0;
            for (char cc: row.toCharArray()) {
                c[i][ccount] = cc;
                ccount++;
            }
        }

        int sum = h + w;
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < (Math.pow(2, sum)); i++){
            x.clear();
            y.clear();
            int black = 0;
            char[][] strings = new char[h][w];
            for (int j = 0; j < h; j++) {
                if (w >= 0) System.arraycopy(c[j], 0, strings[j], 0, w);
            }
            for (int j = 0; j < sum; j++) {
                if ((1 & i >> j) == 1) {
                    if (j < h) {
                        x.add(j);
                    }else {
                        y.add(j - h);
                    }
                }
            }
            if (!x.isEmpty()) {
                for (int xx :x) {
                    for (int l = 0; l < w; l++) {
                        strings[xx][l] = 'R';
                    }
                }
            }
            if (!y.isEmpty()) {
                for (int yy: y) {

                        for (int l = 0; l < h; l++) {
                            strings[l][yy] = 'R';
                        }

                }
            }
            for (int l = 0; l < h; l++) {
                for (int m = 0; m < w; m++) {
                    if (strings[l][m] == '#') {
                        black++;
                    }
                }
            }
            if (black == k) {
                count++;
            }
            test++;
        }
        System.out.println(count);
    }


    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}



