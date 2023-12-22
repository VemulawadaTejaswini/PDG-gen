import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	if (a <= 0 && 0 <= b) {
    		System.out.println("Zero");
    	} else if (0 < a || (a+b)%2 != 0) {
    		System.out.println("Positive");
    	} else {
    		System.out.println("Negative");
    	}
    }
}