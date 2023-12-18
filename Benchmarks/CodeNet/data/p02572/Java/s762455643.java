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

    long total = 0;
    for (int i = 0; i < a.size() - 1; i++) {
      for (int j = i + 1; j < a.size(); j++) {
        long add = 0;
        if (a.get(i) * a.get(j) >= mod) {
          add = a.get(i) * a.get(j) % mod;
        } else {
          add = a.get(i) * a.get(j);
        }

        total += add;
        if (total >= mod) {
          total = total % mod;
        }
      }
    }

    System.out.println(total);
  }
}