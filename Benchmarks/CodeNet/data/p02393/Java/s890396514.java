import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] string = line.split(" ");
		int[] is = new int[string.length];
		for (int i = 0; i < is.length; i++) {
			is[i] = Integer.parseInt(string[i]);
		}

		int max = is[0];
		int min = is[0];
		int mid = is[0];

		if (max < is[1]) {
			max = is[1];
		}
		if (max < is[2]) {
			max = is[2];
		}
		if (min > is[1]) {
			min = is[1];
		}
		if (min > is[2]) {
			min = is[2];
		}
		if ((is[0] < is[1] && is[0] > is[2])
				|| (is[0] > is[1] && is[0] < is[2])) {
			mid = is[0];
		}
		if ((is[1] < is[0] && is[1] > is[2])
				|| (is[1] > is[0] && is[1] < is[2])) {
			mid = is[1];
		}
		if ((is[2] < is[1] && is[2] > is[0])
				|| (is[2] > is[1] && is[2] < is[0])) {
			mid = is[2];
		}

		System.out.println(min + " " + mid + " " + max);

	}

}