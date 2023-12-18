import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		    Scanner scanner = new Scanner(System.in);
		    
		    String N = scanner.next();
		    int n = Integer.parseInt(N);
		    long sum = 0;
	        while(n > 0){
	            sum += n % 10;
	            n /= 10;
	        }

	        long sho = sum % 9;
	        if(sho == 0) {
	        System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
}
}
