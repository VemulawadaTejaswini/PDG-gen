import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int count = 0;
		for (Integer aInt : a) {
			while (aInt % 2 == 0) {
				aInt /= 2;
				count++;
			}
		}
		System.out.println(count);
	}
}
