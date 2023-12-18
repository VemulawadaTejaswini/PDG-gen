import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int ans = N%2==0 ? N/2-1 : N/2;
    System.out.println(ans);
  }
}