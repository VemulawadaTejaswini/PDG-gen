import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
    	
    	if (A < 10) {
	        System.out.println(A);
    		return ;
    	}
    	if (A < 100) {
	        System.out.println(9);
    		return ;
    	}
    	if (A < 1000) {
	        System.out.println(A-10*10+9+1);
    		return ;
    	}
    	if (A < 10000) {
	        System.out.println(10*10*10-10*10+9);
    		return ;
    	}
    	if (A < 100000) {
	        System.out.println(A-10*10*10*10+10*10*10-10*10+9+1);
    		return ;
    	}
	    System.out.println(10*10*10*10*10-10*10*10*10+10*10*10-10*10+9);
    }
}