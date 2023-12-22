import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 long X = scan.nextLong();
 double azuke = 100;
 double N = 0;
 double rishi = 0.01;
 int count = 0;
  
 
   for (int i = 0; i < 10000; i++){
       if (azuke < X){
  		  N = azuke * 1.01;
          azuke = Math.floor(N);
    	  count += 1;
    	 }
  	   else{
         System.out.println(count);
         break;
   }
  } 
 }
}