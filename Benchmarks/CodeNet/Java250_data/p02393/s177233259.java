import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 public static void print(int a,int b,int c){
	 System.out.print(a);
	 System.out.print(" ");
	 System.out.print(b);
	 System.out.print(" ");
	 System.out.println(c);
 }
    public static void main(String[] args) throws IOException {
             
       Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      if(a<=b && b<=c){
    	print(a,b,c);
      }
      else if(b<=c && c<=a){
    	 print(b,c,a);
      }
      else if(c<=a && a<=b){
     	 print(c,a,b);
       }
      else if(a<=c && c<=b){
     	 print(a,c,b);
       }
      else if(b<=a && a<=c){
     	 print(b,a,c);
       }
      else if(c<=b && b<=a){
     	 print(c,b,a);
      	
       }
     	 
      } 
   
    }