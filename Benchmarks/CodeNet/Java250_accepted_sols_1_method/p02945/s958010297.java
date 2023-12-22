import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		int a = sc.nextInt();
    		int b = sc.nextInt();

    		int plus = a + b;
    		int minus = a - b;
    		int multi = a * b;

    		if (plus > minus) {
    			if (multi > plus) {
    				System.out.println(multi);
    			} else {
    				System.out.println(plus);
    			}
    		} else {
    			if (multi > minus) {
    				System.out.println(multi);
    			} else {
    				System.out.println(minus);
    			}
    		}
    	} finally {
    		sc.close();
    	}
    }
}

