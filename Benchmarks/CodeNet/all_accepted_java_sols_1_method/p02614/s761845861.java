import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static int h, w, k, ans;
  static char[][] c;
  static String res;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    h = Integer.parseInt(in[0]);
    w = Integer.parseInt(in[1]);
    k = Integer.parseInt(in[2]);

    c = new char[h][w];

    for (int i = 0; i < h; i++) {
      in = br.readLine().split(" ");
      for (int j = 0; j < w; j++) {
        c[i][j] = in[0].charAt(j);
      }
    }

    br.close();

    for (int i = 0; i < (1 << h); i++) {
      for (int j = 0; j < (1 << w); j++) {
        int black = 0;
        for (int l = 0; l < h; l++) {
          if(((i >> l) & 1) == 1) continue;
          for (int m = 0; m < w; m++) {
            if(((j >> m) & 1) == 1) continue;
            if(c[l][m] == '#') black++;
          }
        }
        if(black == k) ans++;
      }
    }

    out.println(ans);

    out.flush();

  }
}