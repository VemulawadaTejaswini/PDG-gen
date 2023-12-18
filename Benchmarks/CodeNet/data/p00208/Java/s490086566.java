import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int ans[] = new int[20];
			int id = 0;
			while (n != 0) {
				ans[id++] = n % 8;
				n /= 8;
			}
			for (int i = 0; i < id; i++) {
				if (4 <= ans[i]) {
					ans[i]++;
				}
				if (6 <= ans[i]) {
					ans[i]++;
				}
			}
			for (int i = id - 1; 0 <= i; i--) {
				System.out.print(ans[i]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}