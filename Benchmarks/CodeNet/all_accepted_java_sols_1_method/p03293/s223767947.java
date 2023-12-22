import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    
    for (int i = 0; i < S.length(); ++i){
      if (S.equals(T)){  
        System.out.println("Yes");
        return;
       }
      
      char[] s1 = S.toCharArray();
      char[] s2 = new char[S.length()];
      
      for(int j = 0; j < S.length(); ++j){
        if(j == 0){
          s2[S.length()-1] = s1[0];
        }else{
          s2[j-1] = s1[j];
        }
      }
      S = String.valueOf(s2);
    }
 
        System.out.println("No");
   
  }
}