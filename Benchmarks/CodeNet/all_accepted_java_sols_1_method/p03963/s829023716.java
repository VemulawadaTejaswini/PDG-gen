import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    sc.close();

    long ans = (long) (K * (Math.pow(K - 1, N - 1)));

    System.out.println(ans);
  }
}