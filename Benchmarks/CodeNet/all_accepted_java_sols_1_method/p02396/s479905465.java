public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int l = 0;
		int[] a = new int[1];//int[l]
		int[] b = new int[1];//int[l]
		while (true) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}

			l++;

			a = new int[l];
			for (int i = 0; i < l - 1; i++) {
				a[i] = b[i];
			}
			a[l - 1] = x;

			b = new int[l];
			for (int i = 0; i < l; i++) {
				b[i] = a[i];
			}
		}

		for (int i = 0;i < a.length;i++) {
			System.out.println("Case " + (i+1) + ": " + b[i]);
		}
	}
}