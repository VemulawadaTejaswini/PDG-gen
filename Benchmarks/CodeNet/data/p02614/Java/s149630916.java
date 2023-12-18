import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    String[] s = new String[h];

    for (int i = 0; i < h; i++) {
      s[i] = sc.next();
    }

    char[][] c = new char[h][w];

    int ans = 0;

    // while (true) {
      for (int i = 0; i < Math.pow(2,h+w); i++) {

        for (int j = 0; j < h; j++) {
          c[j] = s[j].toCharArray();
        }

        for (int j = 0; j < h+w; j++) {
          if ((1&i >> j) == 1) {
            if (j < h) {
              for (int l = 0; l < w; l++) {
                // System.out.println(c[j]);
                c[j][l] = 'r';
              }
            } else {
              for (int l = 0; l < h; l++) {
                // System.out.println(c[l][j-h]);
                c[l][j-h] = 'r';
              }
            }
          }
        }

        // System.out.println();

        int count = 0;

        for (int j = 0; j < h; j++) {
          for (int l = 0; l < w; l++) {
            if (c[j][l] == '#') {
              count++;
            }
          }
        }
        if (count == k) {
          ans++;
        }
      }
    // }

    System.out.println(ans);

  }

}
