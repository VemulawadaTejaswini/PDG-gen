import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i = 0; i < 3; ++i) {
			String[] tokens = in.nextLine().split(" ");
			a[i] = Integer.parseInt(tokens[0]);
			b[i] = Integer.parseInt(tokens[1]);
		}
		in.close();
		int[] counts = new int[4];
		Arrays.fill(counts, 0);
		for (int i = 0; i < 3; ++i) {
			counts[a[i] - 1]++;
			counts[b[i] - 1]++;
		}
		int ones = 0;
		int twos = 0;
		for (int i = 0; i < 4; ++i) {
			if (counts[i] == 1) {
				ones++;
			} else if (counts[i] == 2) {
				twos++;
			}
		}
		if (ones == 2 && twos == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}