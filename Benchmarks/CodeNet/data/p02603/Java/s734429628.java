import java.io.*;
import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
        solve();
      out.close();
  }

  private static void solve() {
      int n = sc.nextInt();
      int[] arr = sc.readArray(n);
      List<int[]> list = new ArrayList<>();
      int left = 0;
      for(int i = 1; i < n; i++) {
        if(arr[i] >= arr[i-1]) continue;
        if(left < i - 1) {
          list.add(new int[]{arr[left], arr[i-1]});
        }
        left = i;
      }
      if(left < n - 1)
        list.add(new int[]{arr[left], arr[n-1]});


      long res = 1000;
      for(int[] r : list) {
        long cnt = res / r[0];
        long diff = r[1] - r[0];
        res += cnt * diff;
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