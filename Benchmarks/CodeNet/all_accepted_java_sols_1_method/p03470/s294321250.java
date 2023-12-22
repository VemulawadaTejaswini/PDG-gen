import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N   = scanner.nextInt();
		int d[] = new int[N];
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			d[i] = scanner.nextInt();
		}
		scanner.close();
		boolean already;
		for (int i = 0; i < N; i++) {
			already = false;
			for (int j = 0; j < i; j++) {
				if (d[i] == d[j]) {
					already = true;
					break;
				}
			}
			if (!already) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
