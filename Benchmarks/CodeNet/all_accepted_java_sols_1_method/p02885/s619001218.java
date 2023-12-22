import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int ans = A-B*2;
    System.out.println(ans > 0 ? ans : 0);
  }
}