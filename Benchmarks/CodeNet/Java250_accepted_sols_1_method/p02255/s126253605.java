import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] a){
    	Scanner scanner = new Scanner(System.in);
    	
    	int length = Integer.parseInt(scanner.nextLine());
    	String numbers = scanner.nextLine();
    	String[] numberArray = numbers.split(" ",0); 
    	String sortValue;
		System.out.println(Arrays.toString(numberArray).replace(",","").replace("[","").replace("]",""));
		
    	for (int i = 1;i < length; i++) {
    		sortValue = numberArray[i];
    		for (int j = 0; j <= i - 1; j++) {
    			if (Integer.parseInt(sortValue) < Integer.parseInt(numberArray[j])) {
    				for (int k = 0; k <= i-j-1; k++) {
        				numberArray[i-k] = numberArray[i-k-1];
    				}
    				numberArray[j] = sortValue;
    		    break;
    			}
    		}
			System.out.println(Arrays.toString(numberArray).replace(",","").replace("[","").replace("]",""));
    		
    	}
    }
}