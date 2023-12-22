import java.util.Scanner;

public class Main {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] input = new int [5];
	    for(int i = 0; i < input.length; i++) {
	    	input[i] = sc.nextInt();
	    }
	    int k = sc.nextInt();
	    
	    boolean cantComm = false;
	    for( int i = 0; i < input.length-1; i++) {
	    	for( int j = i; j < input.length; j++ ) {
	    		if( k < (input[j] - input[i]) ) {
	    			cantComm = true;
	    			break;
	    		}
	    	}
	    }
	    
	    if( cantComm ) {
	    	System.out.println(":(");
	    } else {
	    	System.out.println("Yay!");
	    }
		sc.close();
	}
}