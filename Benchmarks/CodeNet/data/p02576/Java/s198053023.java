import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    abc176_a();
  }

  private static void abc176_a() {
    try (Scanner sc = new Scanner(System.in)) {
      double nAll = sc.nextInt();
      double xOneTime = sc.nextInt();
      int tMinute = sc.nextInt();

      System.out.println((int) Math.ceil(nAll / xOneTime) * tMinute);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static int parseI(String value) {
    return Integer.parseInt(value);
  }

  public static long parseL(String value) {
    return Long.parseLong(value);
  }

  public static double parseD(String value) {
    return Double.parseDouble(value);
  }

  public static <T> String parseS(T value) {
    return String.valueOf(value);
  }

  public static BigDecimal parseBigD(String value) {
    return new BigDecimal(value);
  }

  public static BigInteger parseBigI(String value) {
    return new BigInteger(value);
  }

}
