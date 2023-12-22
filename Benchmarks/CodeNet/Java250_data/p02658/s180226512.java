import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // printTestValue();
    // abc170_d();
    abc169_b();

  }

  public static void abc169_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int size = Integer.parseInt(sc.next());
      long ans = 1L;
      List<Long> list = new ArrayList<Long>();

      for (int xx = 0; xx < size; xx++) {
        list.add(Long.parseLong(sc.next()));
      }
      Collections.sort(list);
      if (list.get(0) == 0L) {
        System.out.println(0);
        return;
      }
      Collections.reverse(list);
      for (int yy = 0; yy < size; yy++) {
        if (BigInteger.valueOf(ans).multiply(BigInteger.valueOf(list.get(yy)))
          .compareTo(BigInteger.valueOf((long) Math.pow(10d, 18d))) == 1) {
          System.out.println(-1);
          return;
        }
        ans *= list.get(yy);
      }
      System.out.println(ans);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }
}