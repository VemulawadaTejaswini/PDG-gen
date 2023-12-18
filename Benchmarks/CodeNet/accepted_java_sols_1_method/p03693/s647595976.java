
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String r = sc.next();
    String g = sc.next();
    String b = sc.next();

    System.out.println(Integer.parseInt(r+g+b) % 4 == 0 ? "YES" : "NO");
  }
}
