import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String m[] = s.split("");
    int ans = 0;
    for (int i = 0; i < s.length(); i++){
      if (m[i].equals("+")){
        ans++;
      }else{
        ans--;
      }
    }
    System.out.println(ans);
  }
}