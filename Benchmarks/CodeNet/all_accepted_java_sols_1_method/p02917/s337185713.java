import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int max = 0;
		int[] line = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			line[i] = Integer.parseInt(sc.next());
		}

		max += line[0] + line[line.length - 1];

		for (int i = 0; i < n - 2; i++) {
			max += Math.min(line[i], line[i + 1]);
		}

		System.out.println(max);

	}
}