import java.io.*;
import java.util.*;
public class A {
 
  public static void main(String[] args) { 
        solve();
      out.close();
  }

  private static void solve() {

      int n = sc.nextInt();
      int res = 0;
      if(n >= 400 && n < 600) {
        res = 8;
      } else if(n >= 600 && n < 800) {
        res = 7;
      } else if(n >= 800 && n < 1000) {
        res = 6;
      } else if(n >= 1000 && n < 1200) {
        res = 5;
      } else if(n >= 1200 && n < 1400) {
        res = 4;
      }
       else if(n >= 1400 && n < 1600) {
        res = 3;
      }
       else if(n >= 1600 && n < 1800) {
        res = 2;
      }
       else if(n >= 1800 && n < 2000) {
        res = 1;
      }
      out.println(res);
  }

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
  public static FastScanner sc = new FastScanner();

  static class FastScanner {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer("");
      String next() {
        while (!st.hasMoreTokens())
          try {
            st=new StringTokenizer(br.readLine());
          } catch (IOException e) {
            e.printStackTrace();
          }
        return st.nextToken();
      }
      
      int nextInt() {
        return Integer.parseInt(next());
      }
      int[] readArray(int n) {
        int[] a=new int[n];
        for (int i=0; i<n; i++) a[i]=nextInt();
        return a;
      }
      long nextLong() {
        return Long.parseLong(next());
      }
  }
}