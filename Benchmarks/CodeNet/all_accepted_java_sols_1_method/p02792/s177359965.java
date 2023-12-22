import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.close();

    int[] map = new int[100];
    for (int n = 1; n <= N; n++) {
      int h = 0;
      for (int m = n; m != 0; m /= 10) h = m;
      int l = n % 10;
      int k1 = h * 10 + l;
      map[k1]++;
    }

    long ans = 0;
    for (int k1 = 0; k1 < map.length; k1++) {
      int k2 = (k1 % 10) * 10 + k1 / 10;
      ans += map[k1] * map[k2];
    }
    System.out.println(ans);
  }
}