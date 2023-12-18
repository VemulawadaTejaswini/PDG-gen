import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    
	    int N = sc.nextInt() % 500;
	    int A = sc.nextInt();
	    
	    if (N <= A) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	}    
}	