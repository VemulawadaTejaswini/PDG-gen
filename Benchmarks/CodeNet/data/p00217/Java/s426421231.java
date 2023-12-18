
import java.io.*;

public class Main {
  // main
  public static final void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      int n = Integer.parseInt(br.readLine().trim());
      if (n == 0) break;

      int max_d = -1;
      int max_p = -1;

      for (int i = 0; i < n; i++) {
        String[] line = br.readLine().trim().split(" ");
        int p = Integer.parseInt(line[0]);
        int d1 = Integer.parseInt(line[1]);
        int d2 = Integer.parseInt(line[2]);

        int dsum = d1 + d2;

        if (max_d < dsum) {
          max_d = dsum;
          max_p = p;
        }
      }

      System.out.printf("%d %d\n", max_p, max_d);
    }
  }
}