import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		String str2 = sc.nextLine();
		String[] a2 = str2.split(" ");
		int[] a1 = new int[number];
		long total = 0;

		int max = 0;
		int min = 0;

		System.out.println(number);
		for (int i = 0; i < 5; i++) {
			int q = sc.nextInt();
			System.out.print(q + " ");
			if (q > max) {
				max = q;

			}
			if (q < min) {
				min = q;

			}
			total += q;

		}

		System.out.println();
		System.out.println(min);
		System.out.println(max);
		System.out.println(total);

	}
}