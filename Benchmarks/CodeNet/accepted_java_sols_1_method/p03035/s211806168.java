import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = b;
    if((a >= 6) && (a <= 12)) {
      ans = b / 2;
    } else if(a <= 5) {
      ans = 0;
    }
    System.out.println(ans);
  }
}