import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String op = sc.next();
    String b = sc.next();
    long a1 = Long.parseLong(a);
    long b1 = Long.parseLong(b);
    long ans = a1 + b1;
    if(op.equals("-")) ans = a1 - b1;
    System.out.println(ans);
  }
}
