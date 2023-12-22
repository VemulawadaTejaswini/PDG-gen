
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = Integer.parseInt(scan.next());
		}
		int count = 0;
		boolean find;
		while (true) {
			find = false;
			for (int i = 0; i < N; i++) {
				if (h[i] != 0) {
					find = true;
					h[i]--;
				} else if (find && i != N - 1) {
					break;
				} else if (!find && i != N - 1) {
					continue;
				} else if (!find && i == N - 1) {
					System.out.println(count);
					return;
				}
			}
			count++;
		}
	}
}
