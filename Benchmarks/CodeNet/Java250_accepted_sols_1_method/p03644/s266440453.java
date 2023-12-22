import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 1;
    for(int i = 0; i < 10; i++) {
      if((2 * ans) <= n) {
        ans *= 2;
      } else {
        break;
      }
    }
    System.out.println(ans);
  }
}