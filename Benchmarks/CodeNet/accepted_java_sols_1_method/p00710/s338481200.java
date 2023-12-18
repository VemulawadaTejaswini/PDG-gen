import java.util.Scanner;

class Main {

	static int a[];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n == 0 && r == 0) return;
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = n-i;
			}
			//System.out.println(Arrays.toString(a));
			for (int i = 0; i < r; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int count = x-1;
				int b[] = new int[y];
				for (int j = 0; j < y; j++) {
					b[j] = a[count++];
				}

				for (int j = x-2; j >= 0; j--) {
					a[j+y] = a[j];
				}
				for (int j = 0; j < y; j++) {
					a[j] = b[j];
				}
				//System.out.println(Arrays.toString(a));
			}
			System.out.println(a[0]);
		}
	}
}
