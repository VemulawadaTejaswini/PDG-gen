import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    char[] list = S.toCharArray();
    
    int ans = 700;
    for(int i = 0 ; i < list.length; i++){
      if(list[i] == 'o'){
        ans += 100;
      }
    }
    
    System.out.println(ans);  
    
  }  
}