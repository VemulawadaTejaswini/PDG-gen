import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long x = 0;
    long y = 0;
    long min = n;

    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        x = i - 1;
        y = n/i - 1;
      }
      min = Math.min(min,x+y);
    }
    System.out.println(min);
  }
}
