import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    if((b + w) < a) {
      ans = a - (b + w);
    } else if((b + w) > (a + w)) {
      if(b > (a + w)) ans = b - (a + w);
    }
    System.out.println(ans);
  }
}