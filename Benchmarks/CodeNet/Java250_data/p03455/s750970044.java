import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    

		    String str1 = scanner.next();
            String str2 = scanner.next();

            int A = Integer.parseInt(str1);
            int B = Integer.parseInt(str2);
            
            int C = A * B;
            
            if(C % 2 == 0) 
            {
            	System.out.println("Even");
            }
            else 
            {
            	System.out.println("Odd");
            }
        	scanner.close();}
		  }