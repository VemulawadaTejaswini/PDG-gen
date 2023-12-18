import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int p = s.nextInt();

			if (n == 0 && p == 0)
				break;

			int[] candidates = new int[n];
			int cup = p;
			int count = 0;
			int winner = 0;

			while (true) {
				count %= n;
				if (cup != 0) {
					candidates[count]++;
					cup--;
				} else if (cup == 0 && candidates[count] != 0) {
					cup = candidates[count];
					candidates[count] = 0;
				}

				if (candidates[count] == p) {
					winner = count;
					break;
				}
				count++;

			}

			System.out.println(winner);

		}
	}
}