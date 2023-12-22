
public class Main {
	public static void main(String args[]) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		long N = sc.nextLong();

		long A = 0;
		long B = 0;
		for (long i = (long) Math.sqrt(N); i > 0; i--) {
			if (N % i == 0) {
				A = i;
				B = N / i;
				break;
			}
		}

		System.out.println(A + B - 2);
	}

}