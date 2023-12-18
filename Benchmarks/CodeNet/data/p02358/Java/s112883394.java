import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        UnionofRectangles solver = new UnionofRectangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class UnionofRectangles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            HashSet<Integer> xSet = new HashSet<>();
            HashSet<Integer> ySet = new HashSet<>();
            int n = in.nextInt();
            int[] x1 = new int[n];
            int[] y1 = new int[n];
            int[] x2 = new int[n];
            int[] y2 = new int[n];
            long ans = 0;

            for (int i = 0; i < n; i++) {
                x1[i] = in.nextInt();
                y1[i] = in.nextInt();
                x2[i] = in.nextInt();
                y2[i] = in.nextInt();

                xSet.add(x1[i]);
                xSet.add(x2[i]);
                xSet.add(x2[i] + 1);
                ySet.add(y1[i]);
                ySet.add(y2[i]);
                ySet.add(y2[i] + 1);
            }

            // 座圧した
            ArrayList<Integer> xCmp = new ArrayList<>(xSet);
            ArrayList<Integer> yCmp = new ArrayList<>(ySet);
            xCmp.sort(Comparator.naturalOrder());
            yCmp.sort(Comparator.naturalOrder());

        /*
        out.println(xCmp);
        out.println(yCmp);
        
         */

            int[][] imos = new int[xCmp.size()][yCmp.size()];
            for (int i = 0; i < n; i++) {

                // 二分探索で探す
                int px = binarySearch(x1[i], xCmp);
                int py = binarySearch(y1[i], yCmp);
                int mx = binarySearch(x2[i], xCmp);
                int my = binarySearch(y2[i], yCmp);
                // 二次元imos
                imos[px][py]++;
                imos[px][my]--;
                imos[mx][py]--;
                imos[mx][my]++;
            }

            // 右方向に累積
            for (int i = 0; i < xCmp.size(); i++) {
                for (int j = 0; j < yCmp.size() - 1; j++) {
                    imos[i][j + 1] += imos[i][j];
                }
            }

            // 下方向に累積
            for (int i = 0; i < xCmp.size() - 1; i++) {
                for (int j = 0; j < yCmp.size(); j++) {
                    imos[i + 1][j] += imos[i][j];
                }
            }

        /*
        for (int i = 0; i < xCmp.size(); i++) {
            for (int j = 0; j < yCmp.size(); j++) {
                out.print(imos[i][j] + " ");
            }
            out.println();
        }

         */


            for (int i = 0; i < xCmp.size() - 1; i++) {
                for (int j = 0; j < yCmp.size() - 1; j++) {
                    if (imos[i][j] > 0) {
                        ans += (long) (xCmp.get(i + 1) - xCmp.get(i)) * (long) (yCmp.get(j + 1) - yCmp.get(j));
                    }
                }
            }

            out.println(ans);


        }

        int binarySearch(int key, ArrayList<Integer> list) {
            int ng = -1;
            int ok = list.size();
            while (Math.abs(ok - ng) > 1) {
                int mid = (ok + ng) / 2;
                if (key <= list.get(mid)) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            return ok;
        }

    }
}


