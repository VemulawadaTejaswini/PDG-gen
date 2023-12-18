import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // printTestValue();
    // abc170_d();
    // abc169_b();
    // abc169_c();
    abc169_d();
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static void abc169_d() {
    try (Scanner sc = new Scanner(System.in)) {

      long n = Long.parseLong(sc.next());
      int count = 0;
      for (long xB = 2; xB <= n; xB++) {
        if (n % xB != 0) {
          continue;
        }
        for (long xA = xB; xA <= n; xA *= xA) {
          if (n % xA == 0) {
            n /= xA;
            count++;
            continue;
          } else break;
        }
      }
      System.out.println(count);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }
}