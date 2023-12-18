import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			int count = 0;
			for (int j = 0; j < n; j++) {
				while (a[j] % 2 == 0) {
					count ++;
					a[j] /= 2;
				}
			}
			System.out.println(count);
		}
	}
}