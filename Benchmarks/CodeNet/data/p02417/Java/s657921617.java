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
      BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
      int[] cnt = new int[26];
      char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
                          'v','w','x','y','z'};
      String line;
      while (!(line = bfr.readLine()).equals(null)) {
        for (int i = 0; i < line.length(); i++) {
          for (int j = 0; j < 26; j++) {            
            if(alphabet[j] == line.toLowerCase().charAt(i)) {
              cnt[j]++;
            }
          }
        }
        
      }
      for (int i = 0; i < 26; i++) {
        out.println(alphabet[i] + " : " + cnt[i]);
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