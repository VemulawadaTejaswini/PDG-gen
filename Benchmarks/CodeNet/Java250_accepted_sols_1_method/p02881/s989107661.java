import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String line = sc.nextLine();
    	long input = Long.parseLong(line);
    	long result = 0;
    	for(long i = 1;i*i <= input;i++) {
    		if(input%i != 0) {
    			continue;
    		}
    		long j = input/i;
    		result = i + j - 2;
    	}
    	
    	System.out.println(result);
    	
    }
}