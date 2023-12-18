import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        while (true) {
            int h = in.nextInt();
            if (h == 0)
                break;
            int[][] a = new int[h][5];

            for (int i=0; i < h; i++) {
                for (int j=0; j < 5; j++) {
                    a[i][j] = in.nextInt();
                }
            }

            int score = 0;
            while (true) {
                // System.out.println(Arrays.deepToString(a));
                int scoreBefore = score;
                for (int i = 0; i < h; i++) {
                    int cont = 1;
                    int before = a[i][0];
                    for (int j = 1; j < 5; j++) {
                        if (before == a[i][j])
                            cont++;
                        else {
                            if (cont >= 3) {
                                score += before * cont;
                                remove(a, i, j - cont, j);
                            }
                            cont = 1;
                            before = a[i][j];
                        }
                    }
                    if (cont >= 3) {
                        score += before * cont;
                        remove(a, i, 5 - cont, 5);
                    }
                }
                // drop down blocks TODO
                drop(a);

                if (scoreBefore == score)
                    break;
            }

            out.println(score);
        }
    }

    private static void remove(int[][] a, int i, int from, int to) {
        for (int j=from; j < to; j++) {
            a[i][j] = 0;
        }
    }

    private static void drop(int[][] a) {
        List<Integer> temp = new ArrayList<>();
        for (int j=0; j < a[0].length; j++) {
            for (int i=a.length-1; i >= 0; i--) {
                if (a[i][j] != 0)
                    temp.add(a[i][j]);
            }

            int in = 0;
            for (int i=a.length-1; i >= 0; i--) {
                if (in < temp.size())
                    a[i][j] = temp.get(in);
                else
                    a[i][j] = 0;
                in++;
            }

            temp.clear();
        }
    }

}

