import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			if(n==0)break;
			int[] a = new int[100];
			int min = 1000;
			int max = 0;
			int sum = 0;
			int point;

			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}

			for (int i = 0; i < n; i++) {
				sum = sum + a[i];
				if (max < a[i])
					max = a[i];
				if (min > a[i])
					min = a[i];
			}
			point = (sum - min - max) / (n - 2);
			System.out.println(point);
		}
	}
}