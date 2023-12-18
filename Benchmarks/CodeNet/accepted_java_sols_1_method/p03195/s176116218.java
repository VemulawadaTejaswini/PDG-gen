import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			long l = a[i];
			if (l % 2 != 0) {
				flag = true;
				break;
			}
		}
		String ans = flag ? "first" : "second";
		System.out.println(ans);

		sc.close();
	}

}
