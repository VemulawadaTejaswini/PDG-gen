import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/*
https://ir5.hatenadiary.org/entry/20090928/1254203385
 */
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long max1 = Long.MIN_VALUE;
    long min1 = Long.MAX_VALUE;
    long max2 = Long.MIN_VALUE;
    long min2 = Long.MAX_VALUE;
    long max3 = Long.MIN_VALUE;
    long min3 = Long.MAX_VALUE;
    long max4 = Long.MIN_VALUE;
    long min4 = Long.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      long x = sc.nextLong();
      long y = sc.nextLong();
      long x1 = x + y;
      long x2 = x - y;
      long x3 = -x + y;
      long x4 = -x - y;
      if (x1 > max1) {
        max1 = x1;
      } else if (x1 < min1) {
        min1 = x1;
      }
      if (x2 > max2) {
        max2 = x2;
      } else if (x2 < min2) {
        min2 = x2;
      }
      if (x3 > max3) {
        max3 = x3;
      } else if (x3 < min3) {
        min3 = x3;
      }
      if (x4 > max4) {
        max4 = x4;
      } else if (x4 < min4) {
        min4 = x4;
      }
    }
    System.out.println(Math.max(Math.max(Math.max(max1 - min1, max2 - min2), max3 - min3), max4 - min4));
  }
}
