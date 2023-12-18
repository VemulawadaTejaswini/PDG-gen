import java.util.Scanner;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
public class Main {
  public static final long max = (long)Math.pow(10,18);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.next();
    List<Long> longList = new ArrayList<>();

    while (sc.hasNext()) {
      long next = sc.nextLong();
      longList.add(next);
    }
    sc.close();

    if (longList.contains(0)) {
      System.out.println("0");
      sc.close();
      return;
    }

    long result = 1;
    for (long v : longList) {
      result = result * v;
      if (result<0) {
        System.out.println("-1");
        return;
      }
    }
    if (result > max) {
        System.out.println("-1");
    } else {
      System.out.println(String.valueOf(result));
    }
  }
}