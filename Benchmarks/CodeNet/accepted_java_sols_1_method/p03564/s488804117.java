import java.util.*;

class Main{           
 
   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
            
      int start = 1;

      int N = sc.nextInt();

      int K = sc.nextInt();
                  
      for(int i = 0;i < N;i++){
         start = Math.min(start*2,start+K);                    
      }      
      
      System.out.println(start);
      
      
                                                
   }   
 }