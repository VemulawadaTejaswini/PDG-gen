import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] acc = new int[100001];
		for (int i = 2; i < acc.length; i++) {
			long j = 2;
			long mul = 1;
			while (j * j < i) {
				if (i % j == 0) {
					mul *= i;
					if (mul >= 2 * i) break;
				}
				j++;
			}
			if (j * j == i) {
				mul *= j;
			}
			if (mul >= 2 * i) acc[i] = 1;
			acc[i] += acc[i - 1];
		}
		int Q = sc.nextInt();
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < Q; i++) {
			int N = Integer.parseInt(sc.next());
			writer.println(acc[N]);
		}
		writer.flush();
	}

}

