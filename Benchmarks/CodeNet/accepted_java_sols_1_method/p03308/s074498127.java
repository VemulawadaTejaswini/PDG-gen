import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		int max, min;
		max = min = a[0];
		for (int j = 0; j < n; j++) {
			if (max < a[j])
				max = a[j];
			if (min > a[j])
				min = a[j];
		}

		int dif;
		dif = max - min;
		System.out.println(dif);
	}
}