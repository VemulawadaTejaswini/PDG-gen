import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int total = 0;
		int num = 0;
		int min = 0;
		int a[] = new int[n];

		for (int m=0; m < n; m++) {
			a[m] = scan.nextInt();
			total += a[m];
		}

		min = a[0];
		for (int i=1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		total = x - total;

		num = total/min;
		num += n;

		System.out.println(num);

		scan.close();

	}

}
