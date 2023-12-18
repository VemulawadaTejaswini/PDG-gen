public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var N = sc.nextInt();
		var A = new Long[N];
		long sumNow = 0;
		for (var i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			sumNow += A[i];
		}
		long res = 0;
		for (int i = 0; i < N; i++) {
			sumNow -= A[i];
			res += A[i] * sumNow;
			res = mod(res);
		}
		System.out.println(res);

	}

	public static long mod(long input) {
		return input % (1000000000L + 7);
	}
}