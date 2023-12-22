import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int now = 0;
		int count = 1;
		for (int i = 0; i < 1000001; i++) {
			if (a[now] == 2) {
				System.out.println(count);
				return;
			} else {
				now = a[now]-1;
				count++;
			}
		}
		System.out.println(-1);
	}
}
