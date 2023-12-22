import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    sc.close();

    long ans = 0;
    long n = 100;

    while (n < X) {
      n *= 1.01;
      ans++;
    }
    System.out.println(ans);
  }
}
