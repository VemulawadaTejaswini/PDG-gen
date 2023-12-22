import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int flag=1;

		loop:
		while (flag==1) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 1) {
					flag=0;
					break loop;
				} else {
					a[i] /= 2;
				}
			}
			count++;
		}

		System.out.print(count);
	}
}