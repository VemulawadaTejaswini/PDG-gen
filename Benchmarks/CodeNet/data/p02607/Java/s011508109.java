import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int count = 0;
    for (int i = 1; i <= N; i++) {
      int n = in.nextInt();
      if (i % 2 == 1 && n % 2 == 1) count++;
    }
    System.out.println(count);
  }

  public static int gcd(int a, int b) {
        if (b == 0) return a;
    return gcd(b, a % b);

  }

  public static long gcd(long a, long b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}