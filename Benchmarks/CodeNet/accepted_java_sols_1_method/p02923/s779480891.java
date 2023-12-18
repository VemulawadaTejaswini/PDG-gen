import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		Long[] step = new Long[n];
		int max = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			step[i] = Long.parseLong(sc.next());
		}

		for (int i = 0; i < n - 1; i++) {
			if (step[i] >= step[i + 1]) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}

		System.out.println(max);

	}
}