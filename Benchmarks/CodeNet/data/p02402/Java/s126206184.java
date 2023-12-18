public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = Integer.parseInt( sc.nextLine() );

		String[] stra = sc.nextLine().split(" ");
		long[] a = new long[n];
		for ( int i = 0; i < n; i++) {
			a[i] = Long.parseLong(stra[i]);
		}

		java.util.Arrays.sort(a);
		long min = a[0];
		long max = a[n-1];

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		System.out.printf("%d %d %d\n", min, max, sum);
	}

}