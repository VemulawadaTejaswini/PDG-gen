import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);
		String line2 = sc.nextLine();
		String[] x = line2.split(" ");
		int[] a = new int[x.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(x[i]);
		}

		for (int i = 0; i < a.length; i++) {
			int keep = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > a[j + 1]) {
				a[j] = a[j + 1];
				j--;
			}
			a[j + 1] = keep;
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println(a[0] + " " + a[a.length] + " " + sum);

	}

}