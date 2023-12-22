import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			int j = 0;
			while (true) {
				cnt = j * a[i] + 1;
				if (cnt <= d) {
					j++;
				} else {
					break;
				}
			}
			sum += j;
		}

		System.out.println(sum + x);

		sc.close();
	}

}
