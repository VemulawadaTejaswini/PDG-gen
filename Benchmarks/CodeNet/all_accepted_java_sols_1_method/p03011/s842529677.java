import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q=sc.nextInt();
    int r = sc.nextInt();
    int ans = p+q;
    int ans2 = q+r;
    int ans3 = Math.min(ans, ans2);
    System.out.println(Math.min(ans3, r+p));


  }
}