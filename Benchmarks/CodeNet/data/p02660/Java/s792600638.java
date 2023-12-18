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
//    printTestValue();
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
      long m = n;

      long num1 = 2L;
      long num2 = 1L;
      int count = 0;

      while (num1 * num1 <= m) {
        long num = (long) Math.pow(num1, num2);
        if (n % num != 0) {
          num1++;
          num2 = 1L;
          continue;
        }
        n /= num;
        count++;
        num2++;
      }

      if (n == m && n != 1) {
        count = 1;
      }
      System.out.println(count);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }
}