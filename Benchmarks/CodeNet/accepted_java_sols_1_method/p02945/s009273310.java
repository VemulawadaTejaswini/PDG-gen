import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] numberAandB = sc.nextLine().split(" ");
    	int numberA = Integer.parseInt(numberAandB[0]);
    	int numberB = Integer.parseInt(numberAandB[1]);
    	int result = -100000;
    	
    	int plusAB = numberA + numberB;
    	int minusAB = numberA - numberB;
    	int multiAB = numberA*numberB;
    	if(result <= plusAB) {
    		result = plusAB;
    	}
    	if(result <= minusAB) {
    		result = minusAB;
    	}
    	if(result <= multiAB) {
    		result = multiAB;
    	}
    	System.out.println(result);
    	
    	
	}
}