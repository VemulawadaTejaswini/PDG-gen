
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String readStr;
    while ((readStr = reader.readLine()) != null) {
      double x, y;
      //ax+by=c, dx+ey=fの連立方程式を求める
      //expAOfConstantsにはabc、expBOfConstantsにはdefがはいる
      String[] formattedStrs = readStr.split(" ");
      int[] expAOfConstants = new int[3];
      int[] expBOfConstants = new int[3];
      for (int i = 0; i < 3; i++)
        expAOfConstants[i] = Integer.parseInt(formattedStrs[i]);
      for (int i = 0; i < 3; i++)
        expBOfConstants[i] = Integer.parseInt(formattedStrs[i+3]);

      //AとDの最小公倍数を求める。どちらも絶対値にしてから
      int a_d_lcm = lcm(Math.abs(expAOfConstants[0]), Math.abs(expBOfConstants[0]));
      
      //それぞれのAとDが同じになるように式を乗算していく
      int a_d_lcm_division_a = a_d_lcm / expAOfConstants[0];
      for (int i = 0; i < expAOfConstants.length; i++)
        expAOfConstants[i] = expAOfConstants[i] * a_d_lcm_division_a;
      int a_d_lcm_division_d = a_d_lcm / expBOfConstants[0];
      for (int i = 0; i < expBOfConstants.length; i++)
        expBOfConstants[i] = expBOfConstants[i] * a_d_lcm_division_d;
      
      //AとDが加算か減算で0になるよう計算する。++, --なら減算、+-, -+なら加算で計算する。
      //これでexpAConstantsがny=mの形になる。
      if ((expAOfConstants[0] < 0 && expBOfConstants[0] < 0) || (expAOfConstants[0] > 0 && expBOfConstants[0] > 0)) {
        expAOfConstants[0] = expAOfConstants[0] - expBOfConstants[0];
        expAOfConstants[1] = expAOfConstants[1] - expBOfConstants[1];
        expAOfConstants[2] = expAOfConstants[2] - expBOfConstants[2];
      } else {
        expAOfConstants[0] = expAOfConstants[0] + expBOfConstants[0];
        expAOfConstants[1] = expAOfConstants[1] + expBOfConstants[1];
        expAOfConstants[2] = expAOfConstants[2] + expBOfConstants[2];
      }
      //y=m÷nの形にする(yの値を求める)
      y = expAOfConstants[2] / expAOfConstants[1];
      //xの値を求める。x= (f - ey) / d
      x = (expBOfConstants[2] - (expBOfConstants[1] * y)) / expBOfConstants[0];
      
      System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y));
    }

  }

  public static int gcd(int m, int n) {
    if (m < n)
      return gcd(n, m);

    int temp;
    while (m % n != 0) {
      temp = m;
      n = m % n;
      m = temp;
    }
    return n;
  }

  public static int lcm(int m, int n) {
    return (m * n) / gcd(m, n);
  }
  
}