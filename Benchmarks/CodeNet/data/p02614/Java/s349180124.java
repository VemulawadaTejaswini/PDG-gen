import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    char[][] c = new char[h][w];
    char[][] cpy = new char[h][w];
    int sum = 0;

    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for (int j = 0; j < w; j++) {
        c[i][j] = s.charAt(j);
        cpy[i][j] = c[i][j];
      }
    }

    for (int bit = 0; bit < Math.pow(2, h); ++bit) {
      for (int bitw = 0; bitw < Math.pow(2, w); ++bitw) {

        int cnt = 0;
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
            c[i][j] = cpy[i][j];
          }
        }

        for (int i = 0; i < h; ++i) {
          if ((1 & (bit >> i)) == 1) { // i が bit に入るかどうか
            for (int j = 0; j < w; j++) {
              c[i][j] = '*';
            }
          }
        }

        for (int i = 0; i < w; ++i) {
          if ((1 & (bitw >> i)) == 1) { // i が bit に入るかどうか
            for (int j = 0; j < h; j++) {
              c[j][i] = '*';
            }
          }
        }

        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
            if (c[i][j] == '#') {
              cnt++;
            }
          }
        }

        if (cnt == k) {
          sum++;
        }
      }
    }

    System.out.println(sum);

  }
}