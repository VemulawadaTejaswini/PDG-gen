import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //
    String s = sc.next();
    //
    String t = sc.next();
    
    int ans = 0;
    
    for (int i = 0; i < s.length(); i++){
      String s1 = s.substring(i, i+1);
      String t1 = t.substring(i, i+1);
      
      if(!(s1.equals(t1))){
        ans++;
      }
    }
    
    System.out.println(ans);
  }
}