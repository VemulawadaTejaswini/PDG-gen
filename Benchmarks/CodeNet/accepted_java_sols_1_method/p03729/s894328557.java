import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    int an = a.length()-1;
    int bn = b.length()-1;    
    
    String ans;
    
    if(a.charAt(an)==b.charAt(0)&&b.charAt(bn)==c.charAt(0)) ans = "YES";
    else ans = "NO";


    System.out.println(ans);
    
  }
}