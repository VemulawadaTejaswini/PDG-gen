import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    long n = sc.nextLong();
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long count = 0;
		    
		    
		    if(a > b) {
		    	count = 0;
		    }else {
		    	if(n ==1) {
		    		if(a == b) {
		    			count = 1;
		    		}else {
		    			count = 0;
		    		}
		    	}else {
		    		count = (b-a)*(n-2)+1;
		    	}
		    }
		    System.out.println(count);
		    
		    sc.close(); }
}