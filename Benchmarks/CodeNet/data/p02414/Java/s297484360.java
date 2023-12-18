import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
  static InputReader in;
  static PrintWriter out;

  static class Solution {
    void solve() throws IOException {
      int n = in.nextInt();
      int m = in.nextInt();
      int l = in.nextInt();
      
      int[][] a = new int[n][m];
      int[][] b = new int[m][l];
      long[][] c = new long[n][l];
      
      for (int i = 0; i < n; i++) {
        for (int j= 0; j < m; j++) {
          a[i][j] = in.nextInt(); 
        }
      }
      
      for (int i = 0; i < m; i++) {
        for (int j= 0; j < l; j++) {
          b[i][j] = in.nextInt();
        }
      }
      
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < l; j++) {
          for (int k = 0; k < m; k++) {
            c[i][j] += a[i][k] * b[k][j];
          }
        }
      }
      
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < l; j++) {
          out.print(c[i][j]);
          if (j != l - 1) {
            out.print(" ");
          } else {
            out.print("\n");
          }
        }
      }
//      End solve()
    }
//    End Solution
}

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}

  static class InputReader {
    public BufferedReader br;
    public StringTokenizer st;

    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream));
    }

    public int nextInt() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }

    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken());
    }

    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }

    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }


  }

}