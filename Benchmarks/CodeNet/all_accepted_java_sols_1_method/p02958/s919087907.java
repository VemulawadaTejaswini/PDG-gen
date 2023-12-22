import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n[] = new int[N];
		int p[] = new int[N];
		int a = 0;
		for (int i = 0; i < N; i++) {
			n[i] = i + 1;
			p[i] = sc.nextInt();
			if (n[i] != p[i]) {
				a++;
			}
		}
		sc.close();
		if (a <= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
