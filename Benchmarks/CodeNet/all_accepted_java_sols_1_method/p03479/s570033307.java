import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = Long.parseLong(sc.next());
    long y = Long.parseLong(sc.next());
    int ans = 0;
    while(x <= y) {
      ans++;
      x *= 2;
    }
    System.out.println(ans);
  }
}
