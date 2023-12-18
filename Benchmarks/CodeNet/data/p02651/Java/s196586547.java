import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  static HashMap<String, Long> memo = new HashMap<>();
  public static void main(String[] args) {
    FastReader sc = new FastReader();

    int t = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < t; i++) {
      memo.clear();
      int n = Integer.parseInt(sc.nextLine());
      long[] a = new long[n];
      String[] attr_a = sc.nextLine().split(" ");
      for(int j = 0; j < n; j++){
        a[j] = Long.parseLong(attr_a[j]);
      }
      String s = sc.nextLine();
      long result = minmax(0, s, a, 0);
      System.out.println(result == 0 ? 0 : 1);
    }
  }
  static long minmax(long cur, String s, long[] arr, int depth){
    String key = cur + "__" + depth;
    if(memo.containsKey(key)){
      return memo.get(key);
    }
    if(s.length() <= depth){
      return cur;
    }
    if(s.charAt(depth) == '0'){
      if(cur != 0){
        long ret = minmax(cur ^ arr[depth], s, arr, depth + 1);
        String newkey = (cur ^ arr[depth]) + "__" + depth;
        memo.put(newkey, ret);
        if(ret != 0){
          long ret2 = minmax(cur , s, arr, depth + 1);
          memo.put(key, ret2);
          return ret2;
        } else {
          return ret;
        }
      } else {
        long ret = minmax(cur ^ arr[depth], s, arr, depth + 1);
        String newkey = (cur ^ arr[depth]) + "__" + depth;
        memo.put(newkey, ret);
        return ret;
      }
    } else {
      if(cur == 0){
        long ret = minmax(cur ^ arr[depth], s, arr, depth + 1);
        String newkey = (cur ^ arr[depth]) + "__" + depth;
        memo.put(newkey, ret);
        return ret;
      } else {
        long ret = minmax(cur , s, arr, depth + 1);
        memo.put(key, ret);
        return ret;
      }
    }
  }

  public static class FastReader {
    BufferedReader br;
    StringTokenizer st;


    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (Exception r) {
          r.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());//converts string to integer
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (Exception r) {
        r.printStackTrace();
      }
      return str;
    }
  }
}
