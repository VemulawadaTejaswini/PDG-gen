import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] s = S.toCharArray();
    int i = 0;
    int j = s.length-1;
    int ans = 0;
    
    while(i<j){
      if(s[i] != s[j]){
        ans++;
      }
      i++;
      j--;
    }
   
      System.out.println(ans);
    
  }  
}