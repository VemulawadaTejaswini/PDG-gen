import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    sc.close();

    List<Long> l = new ArrayList<>();
    for (long n = 1; n < 10; n++) l.add(n);

    int ni = 0;
    long n = 0;
    for (int i = 10; i < K + 1; i++) {
      long n1 = l.get(ni);
      if (n == 0) {
        n = n1 * 10 + n1 % 10;
        if (0 < n % 10) n--;
      }

      l.add(n++);

      if (n % 10 == 0 ||
          1 < n - (n1 * 10 + n1 % 10)) {
        n = 0;
        ni++;
      }
    }

    long ans = l.get(K - 1);
    System.out.println(ans);
  }
}