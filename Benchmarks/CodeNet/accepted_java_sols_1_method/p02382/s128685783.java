import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int n = Integer.parseInt(br.readLine()); // 何次元か
      String[] x = br.readLine().split("\\s"); // x座標
      String[] y = br.readLine().split("\\s"); // y座標
      double d = 0;  // 距離
      List<Double> mdList = new ArrayList<>(); // 距離のリスト

      // マンハッタン距離（p = 1 のとき）
      for (int i = 0; i < n; i++) {
        // 絶対値の合計値
        d += Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i]));
      }
      mdList.add(d);
      d = 0;

      // ユークリッド距離（p = 2 のとき）
      for (int i = 0; i < n; i++) {
        // 絶対値を2乗した値の合計値
        d += Math.pow(Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i])), 2);
      }
      // 平方根にして格納
      mdList.add(Math.sqrt(d));
      d = 0;

      // ユークリッド距離（p = 3 のとき）
      for (int i = 0; i < n; i++) {
        // 絶対値を3乗した値の合計値
        d += Math.pow(Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i])), 3);
      }
      // 立方根にして格納
      mdList.add(Math.cbrt(d));
      d = 0;

      // チェビシェフ距離（p = ∞）
      for (int i = 0; i < n; i++) {
        // 最大値を算出
        d = Math.max(d, Math.abs(Double.parseDouble(x[i]) -Double.parseDouble(y[i])));
      }
      mdList.add(d);

      // 結果を出力
      for (Double md: mdList) {
        System.out.printf("%.10f\n", md);
      }

    } catch (NumberFormatException | IOException e) {
      e.printStackTrace();
    }
  }
}
