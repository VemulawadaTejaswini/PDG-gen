import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long a = (N / (A + B) )* A;
    long b = N % (A + B);
    if (b >= A) {
      System.out.println(a + A);
    } else {
      System.out.println(a + b);
    }
  }
}