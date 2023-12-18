import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long min = Integer.MAX_VALUE;
    for (int i = 1; i <= (long)Math.sqrt(n); i++) {
      if (n % i == 0) {
        long a = i;
        long b = n / a;
        min = Math.min(min, Math.max(String.valueOf(a).length(), String.valueOf(b).length()));
      }
    }
    System.out.println(min);
  }
}