import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		for(int i = a.length - 1; i >= 0; i--) {
			if(i != a.length - 1) {
				System.out.printf(" ");
			}
			System.out.printf("%d", a[i]);
		}
		System.out.println("");

		scan.close();
	}
}
