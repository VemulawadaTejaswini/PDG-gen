import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int ans = (S.length() - S.replace("ABC", "").length()) / 3;
    System.out.println(ans);
  }
}
