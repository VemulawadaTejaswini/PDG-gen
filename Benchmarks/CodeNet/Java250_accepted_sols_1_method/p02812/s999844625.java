import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String reS = S.replace("ABC","");
    int ans = (S.length() - reS.length())/3;

    System.out.println(ans);
  }
}