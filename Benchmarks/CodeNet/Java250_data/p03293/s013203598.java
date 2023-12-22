import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    int n = S.length();
    
    String ans = "No";
    for(int i = 0; i <= n; i++){
      if(S.equals(T)){
        ans = "Yes";
        break;
      }
      
      String s1 = new String(S.substring(0,1));
      String s2 = new String(S.substring(1,n));
      S = s2+s1;
    }
    System.out.println(ans);
  }
}