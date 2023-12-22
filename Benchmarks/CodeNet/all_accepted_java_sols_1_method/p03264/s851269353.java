import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		
		if (K%2 == 0) {
			int pair = K/2 * K/2;
			System.out.println(pair);
		} else {
			int pair = (K+1)/2 * (K-1)/2;
			System.out.println(pair);
		}
	}
}