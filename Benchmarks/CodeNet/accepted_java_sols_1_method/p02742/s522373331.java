import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    long ans = (h * w + 1) / 2;
    if((h == 1) || (w == 1)) ans = 1;
    System.out.println(ans);
  }
}
