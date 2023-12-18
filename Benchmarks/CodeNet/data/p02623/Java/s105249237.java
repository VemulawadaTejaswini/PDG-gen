import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[sc.nextInt()];
		int[] b = new int[sc.nextInt()];
		int k = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		long sum = 0L;
		int markA = 0;
		int markB = 0;
		while (sum < k) {
			if (markA < a.length && markB < b.length) {
				if (a[markA] < b[markB]) {
					if (sum + a[markA] > k)
						break;
					sum += a[markA];
					markA++;
				} else {
					if (sum + b[markB] > k)
						break;
					sum += b[markB];
					markB++;
				}
			} else if (markA < a.length) {
				if (sum + a[markA] > k)
					break;
				sum += a[markA];
				markA++;
			} else if (markB < b.length) {
				if (sum + b[markB] > k)
					break;
				sum += b[markB];
				markB++;
			}

		}
		System.out.println(markA + markB);
	}
}