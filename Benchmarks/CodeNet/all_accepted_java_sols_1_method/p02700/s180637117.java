import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String ans = "No";
    for(int i = 0; i < 200; i++) {
      if((i % 2) == 0) {
        c -= b;
        if(c <= 0) {
          ans = "Yes";
          break;
        }
      } else {
        a -= d;
        if(a <= 0) break;
      }
    }
    System.out.println(ans);
  }
}