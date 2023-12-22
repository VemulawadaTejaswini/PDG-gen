import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    char c1 = S.charAt(0);
    char c2 = S.charAt(1);
    char c3 = S.charAt(2);
    char c4 = S.charAt(3);
    
    String ans = "No";
    if((c1 == c2 && c3 == c4 && c1 != c3) || (c1 == c3 && c2 == c4 && c1 != c2) || (c1 == c4 && c2 == c3 && c1 != c2)){
      ans = "Yes";
    }    
    System.out.println(ans);
  }
}