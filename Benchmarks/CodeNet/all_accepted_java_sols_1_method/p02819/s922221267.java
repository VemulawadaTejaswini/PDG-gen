import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    boolean[] isPrime = new boolean[X * 100];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;
    for (int i = 2; i < isPrime.length; i++) {
      if (isPrime[i]) {
        if (i >= X) {
          System.out.println(i);
          return;
        }
        for (int j = 2 * i; j < isPrime.length; j += i) {
          isPrime[j] = false;
        }
      }
    }
  }
}
