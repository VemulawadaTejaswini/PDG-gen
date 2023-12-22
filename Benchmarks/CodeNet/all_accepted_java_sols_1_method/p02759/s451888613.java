import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int n = sc.nextInt();

    		int result = (int)Math.ceil((double)n / 2);
    		System.out.println(result);

    	} finally {
    		sc.close();
    	}
    }
}
