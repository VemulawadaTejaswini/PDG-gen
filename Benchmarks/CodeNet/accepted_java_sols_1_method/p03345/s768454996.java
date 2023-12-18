import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    long k = s.nextLong();

    if (k % 2 == 0) {
      System.out.println(a - b);
    } else {
      System.out.println(b - a);
    }
  }
}
