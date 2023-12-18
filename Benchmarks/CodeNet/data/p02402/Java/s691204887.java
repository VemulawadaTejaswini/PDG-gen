import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		String[] in = input.split(" ");
		if (n > 0 && n <= 10000) {
			int[] ai = new int[n];
			int minimum = 0;
			int maximum = 0;
			int sum = 0;
			for (int i = 0; i < ai.length; i++) {
				ai[i] = Integer.parseInt(in[i]);
				if (ai[i] >= -1000000 && ai[i] <= 1000000) {
					if (i == 0) {
						minimum = ai[i];
						maximum = ai[i];
					}

					sum += ai[i];

					if (maximum < ai[i]) {
						maximum = ai[i];
					}

					if (minimum > ai[i]) {
						minimum = ai[i];
					}
				} else {
					minimum = 0;
					maximum = 0;
					sum = 0;
					break;
				}
			}
			System.out.print(minimum + " ");
			System.out.print(maximum + " ");
			System.out.println(sum);
		}
	}
}