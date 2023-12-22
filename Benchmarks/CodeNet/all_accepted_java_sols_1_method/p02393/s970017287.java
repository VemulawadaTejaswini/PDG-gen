import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
             
       Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      if(a<=b && b<=c){
    	 System.out.print(a);
    	 System.out.print(" ");
    	 System.out.print(b);
    	 System.out.print(" ");
    	 System.out.println(c);
      }
      else if(b<=c && c<=a){
    	 System.out.print(b);
     	 System.out.print(" ");
     	 System.out.print(c);
     	 System.out.print(" ");
     	 System.out.println(a);
     	
      }
      else if(c<=a && a<=b){
     	 System.out.print(c);
      	 System.out.print(" ");
      	 System.out.print(a);
      	 System.out.print(" ");
      	 System.out.println(b);
      	
       }
      else if(a<=c && c<=b){
     	 System.out.print(a);
      	 System.out.print(" ");
      	 System.out.print(c);
      	 System.out.print(" ");
      	 System.out.println(b);
      	
       }
      else if(b<=a && a<=c){
     	 System.out.print(b);
      	 System.out.print(" ");
      	 System.out.print(a);
      	 System.out.print(" ");
      	 System.out.println(c);
      	
       }
      else if(c<=b && b<=a){
     	 System.out.print(c);
      	 System.out.print(" ");
      	 System.out.print(b);
      	 System.out.print(" ");
      	 System.out.println(a);
      	
       }
     	 
      } 
   
    }