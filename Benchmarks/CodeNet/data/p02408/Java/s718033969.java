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
      String[][] a = new String[5][14];
      for (int i = 0; i < n; i++) {
        switch (in.next()) {
          case "S":
            a[1][Integer.parseInt(in.next())] = "exists";
            break;
            
          case "H":
            a[2][Integer.parseInt(in.next())] =  "exists";
            break;
            
          case "D":
            a[3][Integer.parseInt(in.next())] =  "exists";
            break;
            
          case "C":
            a[4][Integer.parseInt(in.next())] =  "exists";
            break;
            
          default:
            break;
        }
      }
      
      String[] suit = new String[5];
      suit[1] = "S ";
      suit[2] = "H ";
      suit[3] = "D ";
      suit[4] = "C ";
      
      
      for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 13; j++) {
          if (!a[i][j].equals("exists")) {
            out.println(suit[i]+j);
          }
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