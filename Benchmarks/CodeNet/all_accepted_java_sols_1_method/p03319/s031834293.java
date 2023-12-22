import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int cnt = 0;
		n = n - k;
		cnt++;
		if (n % (k - 1) == 0) {
		}else {
			cnt++;
		}
		n = n / (k - 1);
		cnt += n;
		System.out.println(cnt);
	}
}