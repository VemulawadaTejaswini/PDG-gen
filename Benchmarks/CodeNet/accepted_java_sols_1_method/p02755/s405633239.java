import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = -1;
    for(int t = 1; t <= 1000; t++) {
      int c = (((int)8 * t) / (int)100);
      int d = (((int)10 * t) / (int)100);
      if((a == c) && (b == d)) {
        ans = t;
        break;
      }
    }
    System.out.println(ans);
  }
}