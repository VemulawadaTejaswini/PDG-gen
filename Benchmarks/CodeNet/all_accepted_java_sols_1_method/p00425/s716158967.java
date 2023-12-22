import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = Integer.parseInt(sc.nextLine());
		while (0 < times) {
			int[] side = {1, 2, 3};
			int total = 1;
			for (int i = 0; i < times; i++) {
				char c = sc.nextLine().charAt(0);
				if ('N' == c) {
					int wk = side[0];
					side[0] = side[1];
					side[1] = 7 - wk;
				}
				if ('E' == c) {
					int wk = side[0];
					side[0] = 7 - side[2];
					side[2] = wk;
				}
				if ('W' == c) {
					int wk = side[0];
					side[0] = side[2];
					side[2] = 7 - wk;
				}
				if ('S' == c) {
					int wk = side[0];
					side[0] = 7 - side[1];
					side[1] = wk;
				}
				if ('R' == c) {
					int wk = side[1];
					side[1] = side[2];
					side[2] = 7 - wk;
				}
				if ('L' == c) {
					int wk = side[2];
					side[2] = side[1];
					side[1] = 7 - wk;
				}
				total += side[0];
			}
			System.out.println(total);
			times = Integer.parseInt(sc.nextLine());
		}
	}
}