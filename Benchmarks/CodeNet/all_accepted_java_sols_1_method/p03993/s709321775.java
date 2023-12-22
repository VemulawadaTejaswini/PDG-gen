import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a[] = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
		}
		for (int i = 0; i < n; i++) {
			if (a[a[i]] == i) {
				cnt++;
			}
		}
		System.out.println(cnt / 2);
	}
}