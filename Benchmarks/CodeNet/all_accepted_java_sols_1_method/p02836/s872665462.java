import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final String S = sc.next();
    		StringBuilder sb = new StringBuilder(S);
    		final String SR = sb.reverse().toString();

    		int count = 0;
    		for (int i=0; i<S.length()/2; i++) {
    			if (S.charAt(i) != SR.charAt(i)) {
    				count++;
    			}
    		}

    		System.out.println(count);

    	} finally {
    		sc.close();
    	}
    }
}
