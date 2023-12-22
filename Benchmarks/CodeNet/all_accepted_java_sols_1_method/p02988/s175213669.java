import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] line = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			line[i] = Integer.parseInt(sc.next());
		}

		for (int i = 1; i < n - 1; i++) {
			if ((line[i] > line[i - 1] && line[i] < line[i + 1])
 			 || (line[i] < line[i - 1] && line[i] > line[i + 1])) {
				count++;
			}
		}

		System.out.println(count);

	}
}