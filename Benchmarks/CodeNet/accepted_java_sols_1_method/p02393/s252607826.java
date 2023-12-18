import java.util.Scanner;

public class Main {
	 public static void main(String[] args)
	 {
		 int a,b,c,tmp;
         Scanner std = new Scanner(System.in);
    
        
          a = std.nextInt();
          b = std.nextInt();
          c = std.nextInt();
          
         if(a>b){
        	 tmp=a;
        	 a=b;
        	 b=tmp;
         }
         if(b>c){
        	 tmp=b;
        	 b=c;
        	 c=tmp;
         }
         if(a>b){
        	 tmp=a;
        	 a=b;
        	 b=tmp;
         }
        	 System.out.println(a+" "+b+" "+c);
        	 
         
         std.close();
	 }
	 }
	 


