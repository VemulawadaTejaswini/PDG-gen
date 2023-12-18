public class Main {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		if (n == 0) {
			System.out.println(1);
		} else {
			int ans = 1;
			for (int i = 1; i <= n; i++) {
				ans = ans * i;
			}
			System.out.println(ans);

		}
	}

}