import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int w = sc.nextInt();
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < S.length(); i+=w) {
      ans.append(S.charAt(i));
    }
    System.out.println(ans.toString());
  }
}