import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int ans = 0;
    String a = sc.next();
    boolean flg = true;
    
    for (int i = 0; i < 3; i++){
      String n = a.substring(i, i+1);
      if (n.equals("R") && flg){
        ans++;
      } else if (n.equals("R") && !flg){
        ans = 1;
        flg = true;
      } else {
        flg = false;
      }
    }
    
    System.out.println(ans);
  }
}