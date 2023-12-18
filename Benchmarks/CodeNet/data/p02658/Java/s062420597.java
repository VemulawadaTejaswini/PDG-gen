import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double ans = 1;
    for(int i = 0; i < n; i++) {
      double a = sc.nextDouble();
      if(a == 0) {
        ans = 0;
      } else {
        if(ans <= ((Double)Math.pow(10, 18) / a)) {
          ans *= a;
        } else {
          ans = -1;
          break;
        }
      }
    }
    System.out.println(ans);
  }
}