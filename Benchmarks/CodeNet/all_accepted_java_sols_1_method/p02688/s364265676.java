import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), k = sc.nextInt(), c[] = new int[n], t = 0;

		for(int i = 0; i < k; i++) {
			int h = sc.nextInt();
			for(int j = 0; j < h; j++) {
				int idx = sc.nextInt();
				c[idx-1]++;
			}
		}

		for(int i = 0; i < n; i++) t += c[i] == 0 ? 1 : 0;

		System.out.println(t);
	}
}