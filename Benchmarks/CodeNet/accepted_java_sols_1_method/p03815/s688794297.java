import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long ans = 0;
    long mod = x % 11;
    if (mod == 0) {
      ans = x / 11 * 2;
    } else if (1 <= mod && mod <= 6) {
      ans = x / 11 * 2 + 1;
    } else {
      ans = x / 11 * 2 + 2;
    }
    System.out.println(ans);
  }
}
