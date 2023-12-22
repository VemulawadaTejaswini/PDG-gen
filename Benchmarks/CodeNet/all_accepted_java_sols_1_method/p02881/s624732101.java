import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
  	Scanner s = new Scanner(System.in);
    long n = s.nextLong();
    s.close();
    
    long sqr = Math.round(Math.sqrt(n));
    for(long i = sqr; i > 0; i--) {
      if (n % i == 0) {
        System.out.printf("%d", i + n / i - 2);
        return;
      }
    }

  }
}
