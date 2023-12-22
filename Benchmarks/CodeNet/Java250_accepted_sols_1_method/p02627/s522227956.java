import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans;
    ans = (S.toLowerCase().equals(S))? "a" : "A";
    System.out.println(ans);
  }
}