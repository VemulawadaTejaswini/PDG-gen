import java.io.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      final int n = atoi(in.readLine());
      int[] a = mapInt(in.readLine().split(" "));

      int ans = 64;
      for (int num : a) {
        int cnt = 0;
        while((num & 1) == 0) {
          num = num >> 1;
          cnt++;
        }
        ans = min(ans, cnt);
      }

      out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  int atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s); }
  int[] mapInt(String[] sa) {
    int[] ret = new int[sa.length];
    for (int i = 0; i < sa.length; i++) ret[i] = atoi(sa[i]);
    return ret;
  }
}