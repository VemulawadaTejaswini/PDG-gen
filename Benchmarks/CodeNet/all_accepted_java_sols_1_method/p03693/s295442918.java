import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String r = sc.next();
    String g = sc.next();
    String b = sc.next();
    int num = Integer.parseInt(r+g+b);
    String ans = num%4==0? "YES" : "NO";
    System.out.println(ans);
  }
}

