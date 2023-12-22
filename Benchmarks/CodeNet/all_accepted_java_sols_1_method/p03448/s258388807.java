import java.util.*;
public class Main {
      public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x = s.nextInt();
        
        int count = 0;
        for(int i=a;i>=0;i--){     
          for(int j=b;j>=0;j--){
            for(int k=c;k>=0;k--){
              int number = 500 * i + 100 * j + 50 * k;
              if(number == x){
              count++;  
              }  
            }
          
         }
            
        }
        
        System.out.println(count);
        
      }
}