
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int t = sc.nextInt();
    int ans = (X - t) >= 0 ? (X - t) : 0;

    System.out.println(ans);
  }
}
