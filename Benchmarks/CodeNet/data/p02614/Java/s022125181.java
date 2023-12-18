import java.util.*;

public class Main {
  public static void main(String[] args) {
      // 入力を受けとる
      Scanner sc = new Scanner(System.in);
      // h: 行 w: 列 k : #の希望数
      int h = sc.nextInt();
      int w = sc.nextInt();
      int k = sc.nextInt();
      char[][] box = new char[h][w];
      int existBlack = 0;
      int ansCount = 0;
      for (int i = 0; i < h; i++) {
        String line = sc.next();
        for (int j = 0; j < w; j++) {
          box[i][j] = line.charAt(j);
        }
      }
      // bit全探索
      //行から選択
      for (int i = 0; i < (1 << h); i++) {
        for (int i2 = 0; i2 < (1 << w); i2++) {
          for (int j = 0; j < h; j++) {
            for (int j2 = 0; j2 < w; j2++) {
              if ((1 & (i >> j)) == 0 && (1 & (i2 >> j2)) == 0 && box[j][j2] == '#') {
                existBlack++;
              }
            }
          }
          if (existBlack == k) {
            ansCount++;
          }
          existBlack = 0;
        }
      }
      System.out.println(ansCount);
  }
}