import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		String str;
		int a[];
		int max;
		int min;

		n = sc.nextInt();
		a = new int[8];
		for (int i = 0; i < n; i++) {
			max = 0;
			min = 0;
			str = sc.next();
			for (int j = 0; j < 8; j++) {
				a[j] = str.charAt(j);
			}
			for (int j = 0; j < 8; j++) {
				int maxIndex = j;
				for (int k = j; k < 8; k++) {
					if (a[maxIndex] < a[k]) {
						maxIndex= k;
					}
				}
				int swap = a[maxIndex];
				a[maxIndex] = a[j];
				a[j] = swap;
			}
			for (int j = 0; j < 8; j++) {
				max *= 10;
				max += a[j];
			}
			for (int j = 7; 0 <= j; j--) {
				min *= 10;
				min += a[j];
			}
			System.out.println(max - min);
		}
	}
}