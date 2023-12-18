import java.util.*;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = a.length();
      int b = 0;
        
      
        if(n%2==0){
          for(int i = 0; i < n/2; i++){
            
            char c1 = a.charAt(i);
            char c2 = a.charAt(n-1-i);
            if(c1 != c2){
              b++;
          
            }
          }
          
          
          
          System.out.println(b);
        
        } else {
          for(int i = 0; i < (n-1)/2; i++){
            
            char c1 = a.charAt(i);
            char c2 = a.charAt(n-1-i);
            if(c1 != c2){
              b++;
          
            }
          }
          System.out.println(b);
        } 
      
      
    }
}