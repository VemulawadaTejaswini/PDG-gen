import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNextInt()){
	    	int n = input.nextInt();
	    	int count = 1;
	    	if(n < 2){
	    		System.out.println("0");
	    	}else{
	    		for(int i = 3 ; i <= n ; i+=2){
	    			boolean isprime = true;
	    			for(int j = 3 ; j <= Math.sqrt(i) ; j+=2){
	    				if(i % j == 0){
	    					isprime = false;
	    					break;
	    				}
	    			}
	    			if(isprime)count++;
	    		}
	    	}
	    	System.out.println(count);
	    	
    	}
    }
}