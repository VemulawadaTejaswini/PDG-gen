import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] a;
			a = new int[n];
			double sum = 0, ave = 0, dev = 0;

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			ave = sum / n;
			for (int i = 0; i < n; i++) {
				dev += (a[i] - ave) * (a[i] - ave);
			}
			dev = dev / n;
			dev = Math.sqrt(dev);
			System.out.println(dev);
		}
	}
}