import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int MAX = 1250; // 8%で100円の消費税になる値

		for (int i = 0; i < MAX; i++) {
			if (Math.floor(i * 0.08) == A && Math.floor(i * 0.1) == B) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(-1);
	}
}
