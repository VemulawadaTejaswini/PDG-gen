import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = "";
    if (a + b == 15) {
      s = "+";
    } else if (a * b == 15) {
      s = "*";
    } else {
      s = "x";
    }
    System.out.println(s);
  }
}