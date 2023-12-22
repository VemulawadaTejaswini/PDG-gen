import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	try {
    		final int N = sc.nextInt();
    		final int K = sc.nextInt();

    		System.out.println(Integer.toString(N, K).length());

    	} finally {
    		sc.close();
    	}
    }
}
