import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int w = sc.nextInt();
    String ans = "safe";
    if(s <= w) ans = "unsafe";
    System.out.println(ans);
  }
}