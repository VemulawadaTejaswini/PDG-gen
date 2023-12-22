import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String S = sc.next();
    char[] s = S.toCharArray();
    int ans = 1;
    
    for(int i = 0; i < n-1; i++){
      if(s[i] != s[i+1]){
        ans++;
      }
    }

      System.out.println(ans);
    
  }  
}