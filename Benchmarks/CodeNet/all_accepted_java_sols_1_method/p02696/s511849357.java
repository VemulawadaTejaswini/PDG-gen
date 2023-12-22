import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long B = sc.nextLong();
		long N = sc.nextLong();

		if (N < B) {
			System.out.println(A*N/B);
		} else { // N >= B
			System.out.println(A*(B-1)/B);
		}
	}
}