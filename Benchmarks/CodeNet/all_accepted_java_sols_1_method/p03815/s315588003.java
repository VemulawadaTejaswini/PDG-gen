import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    long X = sc.nextLong();
	    
	    if (X <= 6) {
	    	System.out.println(1);
	    	return;
	    }
	    
	    long count = (X / 11) * 2;
	    X = X % 11;
	    
	    
	    if (X == 0) {
	    	//skip
	    } else if (X <= 6) {
	    	count++;
	    } else {
	    	count += 2;
	    }
	    
	    System.out.println(count);
	}    
}	