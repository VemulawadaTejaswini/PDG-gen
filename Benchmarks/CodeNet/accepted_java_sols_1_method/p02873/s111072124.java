import java.util.*;

public class Main{
  public static void main (String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    long[] num = new long[S.length()+1];
    
    for(int i = 0; i < num.length; i++) {
      num[i] = 0;
    }
    
    for(int i = 0; i < S.length(); i++) {
      if(S.charAt(i)=='<' ) {
        num[i+1] = Math.max(num[i+1],num[i]+1);
      }
    }
    
    for(int i = S.length()-1; i >= 0; i--) {
      if(S.charAt(i)=='>') {
        num[i]=Math.max(num[i+1]+1, num[i]);
      }
    }
    
    long ans = 0;
    for(int i = 0; i < num.length; i++) {
      ans += num[i];
    }
    
    System.out.println(ans);
  
  }
}
    