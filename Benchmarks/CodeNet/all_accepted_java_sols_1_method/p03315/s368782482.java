import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int num = -4;
    if (S.charAt(0) == '+') num += 2;
    if (S.charAt(1) == '+') num += 2;
    if (S.charAt(2) == '+') num += 2;
    if (S.charAt(3) == '+') num += 2;
    System.out.println(num);
  }
}