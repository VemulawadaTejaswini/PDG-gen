import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    if(s.substring(0,1).equals(t.substring(2,3))){
      if(s.substring(1,2).equals(t.substring(1,2))){
        if(s.substring(2,3).equals(t.substring(0,1))){
          System.out.println("YES");
          return;
        }
      }
    }
           System.out.println("NO");
  }
  

  
}