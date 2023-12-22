import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt();
    int now  = 1, ans = 0;
    while (now < B) {
      now += A - 1;
      ans++;
    }
    System.out.println(ans);
  }
}