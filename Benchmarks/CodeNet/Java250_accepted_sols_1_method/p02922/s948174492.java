import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] inputNumber = sc.nextLine().split(" ");
    	int tap = Integer.parseInt(inputNumber[0]);
    	int neededTap = Integer.parseInt(inputNumber[1]);
    	
    	int canUse = 1;
    	int result = 0;
    	while(canUse<neededTap) {
    		canUse += tap -1;
    		result++;
    	}
    		
    		
    	
    	System.out.println(result);
    }
}