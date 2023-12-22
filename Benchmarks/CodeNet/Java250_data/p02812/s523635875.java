import java.util.*;
public class Main {
  public static int countString(String S, String word) {
  	//Sに調べたい文字列を、wordに数えたい文字列を入れる。
    String reS = S.replace(word,"");
    int ans = (S.length() - reS.length())/word.length();
    return ans;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    System.out.println(countString(S,"ABC"));
  }
}