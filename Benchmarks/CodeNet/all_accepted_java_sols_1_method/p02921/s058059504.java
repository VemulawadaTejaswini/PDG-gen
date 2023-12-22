import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final String S = sc.next();
    		final String T = sc.next();

    		int count = 0;
    		for (int i=0; i<S.length(); i++) {
    			if (S.charAt(i) == T.charAt(i)) {
    				count++;
    			}
    		}

    		System.out.println(count);

    	} finally {
    		sc.close();
    	}
    }
}

