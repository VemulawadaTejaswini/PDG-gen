import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "";

    for(int i = 0 ; i < s.length() ; ++i){
      if(s.charAt(i) == '1'){
        ans += "1";
      }
      if(s.charAt(i) == '0'){
        ans += "0";
      }
      if(s.charAt(i) == 'B' && ans.length()>=1){
        ans = ans.substring(0,ans.length()-1);
      }
    }

    System.out.println(ans);
    
  }
}