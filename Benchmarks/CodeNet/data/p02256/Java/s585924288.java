import java.util.*;

public class Main {
	
	public static int GCD(int num1, int num2) {
		if (num2 == 0) return num1;
		else return GCD(num2, num1%num2);
	}
	
    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	int a = in.nextInt();
    	int b = in.nextInt();
    		if (a < b) {
    			int tmp = a;
    			a = b;
    			b = tmp;
    		}
    		System.out.println(GCD(a, b));
    }
}
