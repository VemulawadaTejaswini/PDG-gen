import java.util.*;
     
public class Main{
      
     public static void main(String[] args){  
     
     	Scanner sc = new Scanner(System.in);
       
        String result = "APPROVED";
       
        int n = sc.nextInt();
       
        for(int i=0;i<n;i++){
         
          int a = sc.nextInt();
          
          if (a %2 ==0 && a%3!=0 && a%5 !=0){
 		   result = "DENIED";
  			}
          
        }
       
        	System.out.print(result);
        	
     }
}