import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt() + 2;
		int[] a = new int[n];
		for (int i = 1; i < n - 1; i++) {
			a[i] = sc.nextInt();
		}
		a[0] = 0;
		a[n - 1] = 0;
		/*
		for(int b : a) {
			System.out.print(b);
		}*/
		int dist = 0;
		for (int i = 1; i < n; i++) {
			dist += Math.abs(a[i - 1] - a[i]);
		}
		//System.out.print(dist);

		for (int i = 1; i < n - 1; i++) {
			System.out.println(dist - Math.abs(a[i - 1] - a[i]) - Math.abs(a[i] - a[i + 1]) + Math.abs(a[i + 1] - a[i - 1]));
		}
	}
}