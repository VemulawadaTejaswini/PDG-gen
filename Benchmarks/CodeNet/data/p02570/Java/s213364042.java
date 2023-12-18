import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    String ans = "Yes";
    if((s * t) < d) ans = "No";
    System.out.println(ans);
  }
}