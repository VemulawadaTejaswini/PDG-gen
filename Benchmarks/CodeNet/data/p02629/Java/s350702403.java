import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    StringBuilder sb = new StringBuilder();
    while (true) {
      n--;
      sb.insert(0, (char) ('a' + n % 26));
      n /= 26;
      if (n == 0) {
        break;
      }
    }
    String ans = sb.toString();
    System.out.println(ans);
  }
}
