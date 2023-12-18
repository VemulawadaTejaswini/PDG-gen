
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextLong();
		}

		long total = A[0];
		for (int i = 1; i < A.length; i++) {
			total *= A[i];
		}

		if (total > (long)Math.pow(10, 18)) {
			System.out.println("-1");
		}else{
			System.out.println(total);
		}
	}
}
