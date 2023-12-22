import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = -1;
    for(int i = (10 * b); i <= (10 * b) + 10; i++) {
      int c1 = (i * 8) / 100;
      int c2 = (i * 10) / 100;
      if((c1 == a) && (c2 == b)) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}