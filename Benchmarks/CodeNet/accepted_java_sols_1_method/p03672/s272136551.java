import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int ans = 0;
    for(int i = S.length()-2; i > 0; i-=2){
      S = S.substring(0, i);
      String s1 = S.substring(0, i/2);
      String s2 = S.substring(i/2, i);
      if(s1.equals(s2)){
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}