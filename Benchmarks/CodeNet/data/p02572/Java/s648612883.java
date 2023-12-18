import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final int num = sc.nextInt();
    final List<Long> a = new ArrayList<Long>();
    final long mod = (int) Math.pow(10, 9) + 7;

    for (int i = 0; i < num; i++) {
      a.add(sc.nextLong());
    }

    Long sum = 0L;
    for (int i = 1; i < a.size(); i++) {
      sum = (sum + a.get(i)) % mod;
    }

    Long total = 0L;
    for (int i = 0; i < a.size() - 1; i++) {
      if (i != 0) {
        sum -= a.get(i);
      }
      final Long addedNum = (a.get(i) * sum) % mod;
      total += addedNum;
      total %= mod;
    }

    System.out.println(total);
  }
}