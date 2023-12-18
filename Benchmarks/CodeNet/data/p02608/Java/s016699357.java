import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 1; i <= 100; i++) {
      for (int j = 1; j <= 100; j++) {
        for (int k = 1; k <= 100; k++) {
          int n = i*i + j*j + k*k + i*j + j*k + i*k;
          
          if (!map.containsKey(n)) {
            map.put(n, 0);
          }
          map.put(n, map.get(n) + 1);
        }
      }
    }

    for (int i = 1; i <= N; i++) {
      if (map.containsKey(i)) {
        System.out.println(map.get(i));
      } else {
        System.out.println(0);
      }
    }
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