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
      int k = sc.nextInt();
      int[] arr = sc.readArray(n);
      Queue<Integer> queue = new LinkedList<>();
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < n; i++) {
        queue.offer(arr[i]);
        if(i >= k) {
          int num = queue.poll();
          if(num < arr[i])
            sb.append("Yes\n");
          else
            sb.append("No\n");
        }
      }
      out.print(sb.toString());
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