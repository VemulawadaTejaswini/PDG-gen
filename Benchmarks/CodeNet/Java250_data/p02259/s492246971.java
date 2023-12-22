import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] datastr = sc.nextLine().split(" ");
		int[] a = new int[n];
		for (int i=0; i < n; i++) {
			a[i] = Integer.parseInt(datastr[i]);
		}

		int count = 0;

		for (int i=0; i < n; i++) {
			for (int j = n-1; i+1 <= j; j--) {

				if (a[j-1] > a[j]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					count++;
				}

			}
		}

		for (int i=0; i < n-1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n-1]);
		System.out.println(count);

	}

}