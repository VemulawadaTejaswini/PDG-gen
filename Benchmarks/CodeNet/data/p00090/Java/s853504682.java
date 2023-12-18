import java.io.*;
import java.util.ArrayList;

// main

public class Main {
  private static final int MAX_N = 100;
  private static final double R2 = 4.0;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String line = br.readLine();
      int n = Integer.parseInt(line);
      if (n == 0) break;

      double[] xs = new double[n];
      double[] ys = new double[n];

      for (int i = 0; i < n; i++) {
        String[] strs = br.readLine().split(",");
        xs[i] = Double.parseDouble(strs[0]);
        ys[i] = Double.parseDouble(strs[1]);
      }

      boolean[][] owmtx = new boolean[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
          owmtx[i][j] = (i == j);

      ArrayList<ArrayList<Integer>> grps =
        new ArrayList<ArrayList<Integer>>();
      int max_gl = 1;

      for (int i = 0; i < n; i++) {
        double x0 = xs[i];
        double y0 = ys[i];

        for (int j = 0; j < i; j++) {
          double dx = xs[j] - x0;
          double dy = ys[j] - y0;

          if (dx * dx + dy * dy <= R2)
            owmtx[i][j] = owmtx[j][i] = true;
        }

        ArrayList<ArrayList<Integer>> grps0 =
          new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> g1 = new ArrayList<Integer>();
        g1.add(new Integer(i));
        grps0.add(g1);

        for (ArrayList<Integer> g: grps) {
          boolean tf = true;

          for (Integer j: g)
            if (! owmtx[j][i]) {
              tf = false;
              break;
            }

          if (tf) {
            ArrayList<Integer> g0 = new ArrayList<Integer>();
            g0.addAll(g);
            g0.add(new Integer(i));

            grps0.add(g0);

            int gl = g0.size();
            if (max_gl < gl) max_gl = gl;
          }
        }

        grps.addAll(grps0);
      }

      System.out.println(max_gl);
    }
  }
}