import java.util.*;

public class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if(S.length() < 3) {
      System.out.println(S);
    }else{
      StringBuilder ans = new StringBuilder(S);
      S = ans.reverse().toString();
      System.out.println(S);
    }
  }
}