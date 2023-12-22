import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 5];
		int now = 0;
		for(int i = 1 ; i <= n ; i++) {
			int b = sc.nextInt();
			if(b == now + 1) {
				now++;
			}
		}

		sc.close();
		System.out.println(now == 0 ? now - 1 : n - now);

	}
}

