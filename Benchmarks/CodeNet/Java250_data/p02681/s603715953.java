/*
 *created by Kraken on 12-05-2020 at 15:29
 */
import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    String s = sc.next(), t = sc.next();
    if (t.substring(0, t.length() - 1).equals(s))
      System.out.println("Yes");
    else
      System.out.println("No");
  }

  static class FastReader {

    BufferedReader br;

    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      }
      catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
