import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int count = 0;
		boolean flag = true;
		while (flag) {
			for (int i = 0; i < n; i++) {
				if (a[i] %2 != 0) {
					flag = false;
					break;
				} else {
					a[i] = a[i]/2;
				}
			}
			if (flag) count++;
		}
		System.out.println(count);
	}
}
