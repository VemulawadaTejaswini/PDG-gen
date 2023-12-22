import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      int [] a = new int [5];
      int x=0 ;
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<5;i++){
        a[i] = sc.nextInt();
        
      }
      for(int i =0;i<5;i++){
        if(a[i]==0){
          x = i+1;
        }
      }
      System.out.println(x);

      
     
    }
   
    
       
    
}