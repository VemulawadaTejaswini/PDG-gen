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
      int[][][] residents = new int[5][4][11];
      
      for (int i = 1; i <= n; i++) {
        int b = in.nextInt();
        int f = in.nextInt();
        int r = in.nextInt();
        int v = in.nextInt();
        
        residents[b][f][r] += v;
      }
      
      for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 3; j++) {
          for (int k = 1; k <= 10; k++) {
            out.print(" " + residents[i][j][k]);
          }
          out.print("\n");
        }
        
        if (i != 4) {
          out.println("####################");
        }
      }
//    End solve()
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