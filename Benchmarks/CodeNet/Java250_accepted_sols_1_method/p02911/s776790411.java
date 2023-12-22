import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int a;
		int[] x = new int[n];
		for (int i = 0; i < q; i++) {
			a = sc.nextInt();
			x[a - 1]++;
		}
		for (int i = 0; i < n; i++) {
			if (x[i] >= q - k + 1) {
				sb.append("Yes" + "\n");
			} else {
				sb.append("No" + "\n");
			}
		}
		System.out.println(sb);
	}
}