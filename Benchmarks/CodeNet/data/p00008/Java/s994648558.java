import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  static InputReader in;
  static PrintWriter out;




  static class Solution {
    void solve() throws IOException {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        int n = in.nextInt();
        int a;
        int b;
        int c;
        int d;
        int cnt = 0;
        
        for (int i = 0; i <= 9; i++) {
          a = i;
          for (int j = 0; j <= 9; j++) {
            b = j; 
            for (int k = 0; k <= 9; k++) {
              c = k;
              for (int l = 0; l <= 9; l++) {
                d = l;
                if (a + b + c + d == n) {
                  cnt++;
                }
              } 
            } 
          }
        }
        
        out.println(cnt);
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