import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int m1 = (int)Math.abs(a - c);
    int m2 = (int)Math.abs(a - b);
    int m3 = (int)Math.abs(b - c);
    String ans = "Yes";
    if((m1 > d) && ((m2 > d) || (m3 > d))) ans = "No";
    System.out.println(ans);
  }
}