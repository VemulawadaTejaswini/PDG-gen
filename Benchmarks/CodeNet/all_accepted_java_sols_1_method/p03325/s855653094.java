import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int C = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			if (b % 2 == 0) a[C++] = b;
		}

		for (int i = 0; i < C; i++) {
			int count = 0;
			while(true) {
				a[i] /= 2;
				count++;
				if (a[i] % 2 == 1) {
					break;
				}
				//System.out.println(a[i]);
			}
			max += count;
		}

		System.out.println(max);
	}
}