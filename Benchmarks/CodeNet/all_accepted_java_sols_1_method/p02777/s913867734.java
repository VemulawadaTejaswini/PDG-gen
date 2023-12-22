import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String S = scan.next();
	        String T = scan.next();
	        int num1 = scan.nextInt();
	        int num2 = scan.nextInt();
	        String U = scan.next();

	        if(U.equals(S)){
	        	num1--;
	        }else if(U.equals(T)){
	         	num2--;
	        }
	        scan.close();
	      	System.out.print(num1 + " " + num2);
    }
}
