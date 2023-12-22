import java.util.Scanner;
public class Main{
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
   	    long b = sc.nextLong();
	    long k = sc.nextLong();
      
      	long num1 = a-k ;
      
      if(num1>=0)
              System.out.println((a-k)+" "+b);
      else
      {
        if(num1+b>0)
          System.out.println('0'+" "+(num1+b));
        else
          System.out.println('0'+" "+'0');
      }
      
      
      


 
      
      
 
 
 
		
		
	}
 
}