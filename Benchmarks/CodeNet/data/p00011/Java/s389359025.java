import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] values = new int[w];
		for (int i = 0; i < values.length; i++) {
			values[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			String[] ab = str.split(",");
			int a = 0;
			int b = 0;
			int C = 0;
			a = Integer.parseInt(ab[0]) - 1;
			b = Integer.parseInt(ab[1]) - 1;

			C = values[a];
			values[a] = values[b];
			values[b] = C;
		}
		for (int i = 0; i < n + 1; i++) {
			System.out.println(+values[i]);
		}

	}
}