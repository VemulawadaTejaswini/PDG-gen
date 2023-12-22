import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		int[] a = new int[n];
		for (int i=0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		StringBuilder sb = new StringBuilder();
		for (int i=0; i < n-1; i++) {
			sb.append(a[i] + " ");
		}
		sb.append(a[n-1] + "\n");

		System.out.print(sb);

		for (int i=1; i <= n-1; i++) {

			int v = a[i]; // v : temp
			int j = i - 1;

			while ( j >=0 && a[j] > v ) {

				a[j+1] = a[j]; // a[j] -> a[j+1]
				j--;
				a[j+1] = v;
				// temp -> a[j]
				// j--
			}

			for (int k=0; k < n-1; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println(a[n-1]);

		}
	}

}