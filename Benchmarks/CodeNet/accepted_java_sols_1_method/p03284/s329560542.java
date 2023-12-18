import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		int rem = N % K;
		if (rem == 0) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
    }
}