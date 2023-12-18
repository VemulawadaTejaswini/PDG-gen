import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNext()) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if (n != 0 ||m != 0) {
				int a[] = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = stdIn.nextInt();
				}
				for (int i = 0; i < a.length - 1; i++) {
					for (int j = i + 1; j < a.length; j++) {
						if (a[j] > a[i]) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				for (int i = 1; i < n + 1; i++) {
					if (i % m == 0) {
						a[i - 1] = 0;
					}
				}
				int b = 0;
				for (int i = 0; i < n; i++) {
					b += a[i];
				}
				System.out.println(b);
			}
		}
	}
}