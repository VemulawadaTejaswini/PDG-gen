import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cash;
		int a[] = new int[100];
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int p = 0; p < n / 2; p++) {
			cash = a[p];
			a[p] = a[n-1-p];
			a[n-1-p] = cash;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n-1) {
				System.out.print(" ");
			}else {
				System.out.print("\n");
			}
		}
	}
}