import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				if (a[i] % 3 != 0 && a[i] % 5 != 0) {
					System.out.println("DENIED");
					return;
				}
			}
		}
		System.out.println("APPROVED");
	}
}
