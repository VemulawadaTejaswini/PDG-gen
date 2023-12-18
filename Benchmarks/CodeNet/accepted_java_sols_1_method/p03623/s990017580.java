import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ans = "A";
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(Math.abs(a - x) > Math.abs(b - x)) ans = "B";
    System.out.println(ans);
  }
}