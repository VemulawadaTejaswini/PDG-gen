import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "";
    if(n == 1) {
      ans = "Hello World";
    } else {
      int a = sc.nextInt();
      int b = sc.nextInt();
      ans = String.valueOf(a + b);
    }
    System.out.println(ans);
  }
}