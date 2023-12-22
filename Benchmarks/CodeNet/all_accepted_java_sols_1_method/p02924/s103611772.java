public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		long N = sc.nextInt();

		long result = 0;

		if (N == 1) {
			result = 0;
		}

		if (N % 2 == 0) {
			result = (N - 1 + 1) * ((N-1) / 2) + ((N-1) / 2 + 1);
		} else {
			result = (N - 1 + 1) * (N / 2);
		}

		System.out.println(result);

	}
}