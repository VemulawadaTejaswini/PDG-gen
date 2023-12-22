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
      BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
      String words = br2.readLine();
      int length = words.length();
      char[] converted = new char[length];
      
      for (int i = 0; i < length; i++) {
        if (Character.isUpperCase(words.charAt(i))) {
          converted[i] = Character.toLowerCase(words.charAt(i));
        } else if (Character.isLowerCase(words.charAt(i))){
          converted[i] = Character.toUpperCase(words.charAt(i));
        } else {
          converted[i] = words.charAt(i);
        }
      }
        
      for (int i = 0; i < length; i++) {
        out.print(converted[i]);
      }
      
      out.print("\n");
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