import java.util.Scanner;

public class Main {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] input = new int [5];
	    for(int i = 0; i < input.length; i++) {
	    	input[i] = sc.nextInt();
	    }
	    
	    int lastOrderIndex = input.length-1;
	    int min1digit = Integer.MAX_VALUE;
	    for( int i = 0; i < input.length; i++) {
	    	if( input[i]%10 == 0 ) {
	    		continue;
	    	}
	    	
	    	if( input[i]%10 < min1digit ) {
	    		min1digit = input[i]%10;
	    		lastOrderIndex = i;
	    	}
	    }
	    
	    int sum = 0;
	    for( int i = 0; i < input.length; i++) {
	    	if( i == lastOrderIndex ) {
	    		sum += input[i];
	    	} else if( input[i]%10 == 0 ) {
	    		sum += input[i];
	    	} else {
	    		sum += input[i] + (10 - input[i]%10);
	    	}
	    }
    	System.out.println(sum);

		sc.close();
	}
}