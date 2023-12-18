import java.util.Scanner;

public class Main{
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int prime[] = new int[10001];
		int n;

		prime[0] = -1;
		prime[1] = -1;
		for (int i = 2; i < 10001; i++) {
			for (int j = i; i * j < 10001; j++) {
				prime[i * j] = -1;
			}
		}

		while (sc.hasNext()) {
			n = sc.nextInt();
			for (int i = n; 0 <= i; i--) {
				if (0 <= i - 2 && prime[i] == 0 && prime[i - 2] == 0) {
					System.out.println((i - 2) + " " + i);
					break;
				}
			}
		}
	}
}