import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    long ax = 0;
    if (a > 0) {
      ax = ((a - 1) / x) + 1;
    }
    long bx = (b / x) + 1;
    System.out.println(bx - ax);
  }
}