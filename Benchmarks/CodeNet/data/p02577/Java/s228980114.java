import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		    Scanner scanner = new Scanner(System.in);
		    
		    String N = scanner.next();
		    double n = Double.parseDouble(N);
		    
	        double sho = n % 9;
	        if(sho == 0) {
	        System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
}
}