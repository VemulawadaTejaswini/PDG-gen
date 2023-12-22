import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int count = 0;
    	for (int i = A; i <= B; i++) {
    		String num = Integer.toString(i);
    		if (num.charAt(0) == num.charAt(4) && num.charAt(1) == num.charAt(3)) {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}