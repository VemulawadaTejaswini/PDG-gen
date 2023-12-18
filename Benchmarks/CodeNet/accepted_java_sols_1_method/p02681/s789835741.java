import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    String ans = "No";
    
    String ts = t.substring(0, s.length());
    
    if(ts.equals(s)){
      ans = "Yes";
    }
        
    System.out.print(ans);
    
  }
}