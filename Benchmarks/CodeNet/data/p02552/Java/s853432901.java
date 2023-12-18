import java.io.*;
import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
        solve();
      out.close();
  }

  private static void solve() {
      //String s = sc.next();
      int n = sc.nextInt();
      out.println(n == 0 ? 1 : 0);
  }

  public static void sort(int[] a) {
    int l = 0, r = a.length;
      ArrayList<Integer> list=new ArrayList<>();
      for (int i=l ; i<r; i++) list.add(a[i]);
      Collections.sort(list);
      for (int i=l; i<r; i++) a[i]=list.get(i-l);
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