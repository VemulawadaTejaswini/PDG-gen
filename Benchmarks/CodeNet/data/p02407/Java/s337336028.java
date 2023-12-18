import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = scan.nextInt();
		
		for (int i = 0; i < n/2; i++) {
			int temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
		}
		
		for (int i = 0; i < n; i++) System.out.printf(" %d", a[i]);
		System.out.println();
	}
}

