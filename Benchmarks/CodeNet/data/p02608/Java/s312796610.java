import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n+1];

    int x = 1, y = 1, z = 1;
    int sum = 0;

    for (x = 1; x < n; x++) {
      for (y = x; y < n; y++) {
        for (z = y; z < n; z++) {
          sum = (int)Math.pow(x+y+z,2) - x*y - y*z - z*x;
          if (sum > n) continue;
          if (x == y && y == z && z == x) {
            data[sum]++;
          } else if (x == y || y == z || z == x) {
            data[sum] = 3;
          } else if (x != y && y != z && z != x){
            data[sum] = 6;
          }
        }
      }
    }

    for (int i = 0; i <= n; i++) {
      System.out.println(data[i]);
    }
  }

}
