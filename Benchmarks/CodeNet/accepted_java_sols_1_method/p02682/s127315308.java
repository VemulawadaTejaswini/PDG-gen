import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long K = sc.nextLong();
    sc.close();

    long ans = Long.min(K, A);
    ans -= Long.max((K - A - B), 0);
    System.out.println(ans);
  }
}
