import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    int n = s.length();
    StringBuffer sb = new StringBuffer(s);
    String reverse = sb.reverse().toString();

    int digit = 1; // mod2019
    int sum = 0; // mod2019
    int mod = 2019;
    int remains[] = new int[mod];
    Arrays.fill(remains, 0);
    int res = 0;
    for (int i = 0; i < n; i++) {
      remains[sum]++;
      int a = Character.getNumericValue(reverse.charAt(i));
      sum = (sum + a*digit) % mod;
      digit = digit*10 % mod;
      res += remains[sum]; // 自分より小さくmod2019が等しい数(すなわちremains[sum])がペアになる
    }
    System.out.println(res);
  }
}