import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}		
		int t;
		for (int h = 0; h < n; h++) {
			for (int i = 0; i < n - h - 1; i++) {
				if (l[i] < l[i + 1]) {
					t = l[i];
					l[i] = l[i + 1];
					l[i + 1] = t;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + l[i];
		}
		System.out.println(sum);
	}
}