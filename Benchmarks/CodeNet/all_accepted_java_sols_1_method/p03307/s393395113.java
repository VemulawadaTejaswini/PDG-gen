import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);


		    String str1 = scanner.next();

            int A = Integer.parseInt(str1);


            if(A % 2 == 0)
            {
            	System.out.println(A);
            }
            else
            {
            	System.out.println(A * 2);
            }
        	scanner.close();}
		  }
