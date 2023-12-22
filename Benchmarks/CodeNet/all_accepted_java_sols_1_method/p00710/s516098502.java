
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int b = sc.nextInt();
			if (n == 0 && b == 0)
				break;
			int[] box = new int[n];
			int[] tmp = new int[n];

			for (int i = 0; i < n; i++) {
				box[i] = (n - i);
				// System.out.println(box[i]);
			}
			for (int i = 0; i < b; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.arraycopy(box, 0, tmp, 0, x - 1);
				System.arraycopy(box, x - 1, box, 0, y);
				System.arraycopy(tmp, 0, box, y, x - 1);

			}
			System.out.println(box[0]);
		}
	}
}