import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       String ans="No";
       
       if(A==B) {
    	   if(A!=C) {
    		   ans="Yes";
    	   }
       }
       if(C==B) {
    	   if(A!=C) {
    		   ans="Yes";
    	   }
       }
       if(C==A) {
    	   if(A!=B) {
    		   ans="Yes";
    	   }
       }
       
       
       System.out.println(ans); 	
              		
   }

}