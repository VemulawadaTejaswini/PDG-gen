import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String t = sc.next();
    String ans = "";

    for(int i = 0; i < t.length(); i++){
      if(t.charAt(i) == 'P' || t.charAt(i) == 'D'){
        ans += t.substring(i, i + 1);
      } else if(i + 1 < t.length() && t.charAt(i) == '?' && t.charAt(i + 1) == 'D'){
        ans += "P";
      } else {
        ans += "D";
      }
    }

    System.out.println(ans);
  }
}
