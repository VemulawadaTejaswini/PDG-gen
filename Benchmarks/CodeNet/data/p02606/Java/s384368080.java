import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int L = in.nextInt();
    int R = in.nextInt();
    int d = in.nextInt();

    int count = 0;
    for (int i = L; i <= R; i++) {
      if (i % d == 0) count++;
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