import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    
	    double doubleK = (double)(A + B) / 2;
	    int intK = (A + B) / 2;
	    
	    if (doubleK == intK) {
	    	System.out.println(intK);
	    } else {
	    	System.out.println("IMPOSSIBLE");
	    }
	}	
}	