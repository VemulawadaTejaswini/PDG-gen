import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    String ans = "Yes";
    for(int i = 0; i < S.length(); i++){
      if((i%2 == 0 && S.charAt(i) == 'L') || (i%2 == 1 && S.charAt(i) == 'R')){
        ans = "No";
      }
    }
    System.out.println(ans);
  }
}