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
    abc169_c();
  }

  public static void abc169_c() {
    try (Scanner sc = new Scanner(System.in)) {
      BigDecimal a = new BigDecimal(sc.next());
      BigDecimal b = new BigDecimal(sc.next());

      System.out.println(a.multiply(b).setScale(0, RoundingMode.DOWN));

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }
}