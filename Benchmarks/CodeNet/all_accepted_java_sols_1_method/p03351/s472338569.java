import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String ans = "No";
    if((Math.abs(a - c) <= d) || ((Math.abs(a - b) <= d) && (Math.abs(b - c) <= d))) ans = "Yes";
    System.out.println(ans);
  }
}