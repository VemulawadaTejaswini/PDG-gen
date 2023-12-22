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
      char[] suit = new char[5];
      suit[1] = 'S';
      suit[2] = 'H';
      suit[3] = 'C';
      suit[4] = 'D';
      int n = in.nextInt();
      
      int[][] card = new int[5][14];
      for (int i = 1; i <= n; i++) {
        char tmpsuit = in.next().charAt(0);
        int num = in.nextInt();
        
        switch (tmpsuit) {
          case 'S':
            card[1][num] = 1;
            break;
          case 'H':
            card[2][num] = 1;
            break;
          case 'C':
            card[3][num] = 1;
            break;
          case 'D':
            card[4][num] = 1;
            break;
        }
        
      }
      
      for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 13; j++) {
          if (card[i][j] != 1) {
            out.println(suit[i]+" "+j);
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