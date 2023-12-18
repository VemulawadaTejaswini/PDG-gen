import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  int w, h;
  char[][] c;

  static int[][] ofs = {
      {1, 0},
      {0, 1}
  };

  String[][] done;

  String dfs(int x, int y, String num) {
    if (x >= w) {
      return "";
    }
    if (y >= h) {
      return "";
    }
    if (c[y][x] < '0' || '9' < c[y][x]) {
      return num;
    }
    num += c[y][x];
    if (new BigInteger(done[y][x]).compareTo(new BigInteger(num)) >= 0) {
      return "";
    }
    done[y][x] = num;
    String res = num;
    for (int i = 0; i < 2; ++i) {
      int nx = x + ofs[i][0];
      int ny = y + ofs[i][1];
      String nnum = dfs(nx, ny, num);
      if (res.length() < nnum.length()) {
        res = nnum;
      } else if (res.length() == nnum.length() &&
          new BigInteger(res).compareTo(new BigInteger(nnum)) < 0) {
        res = new BigInteger(nnum).toString();
      }
    }
    return res;
  }

  void run() {
    for (; ; ) {
      w = ni();
      h = ni();
      if ((w | h) == 0) {
        break;
      }
      c = new char[h][w];
      done = new String[h][w];
      for (int i = 0; i < h; ++i) {
        String line = sc.next();
        for (int j = 0; j < w; ++j) {
          c[i][j] = line.charAt(j);
          done[i][j] = "0";
        }
      }
      String ans = "0";
      for (int i = 0; i < h; ++i) {
        for (int j = 0; j < w; ++j) {
          String sans = dfs(j, i, "");
          if (sans.length() > ans.length()) {
            ans = sans;
          } else if (sans.length() == ans.length()) {
            if (new BigInteger(ans).compareTo(new BigInteger(sans)) < 0) {
              ans = sans;
            }
          }
        }
      }
      System.out.println(ans);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}