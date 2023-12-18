import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		String[] in = input.split(" ");
		if (n > 0 && n <= 10000) {
			int[] ai = new int[n];
			for(int j = 0; j < ai.length; j++) {
				ai[j] = Integer.parseInt(in[j]);
			}
			if (ai.length >= -1000000 && ai.length <= 1000000) {
				int min = ai[0];
				int max = ai[0];
				int sum = ai[0];
				for (int i = 1; i <= ai.length - 1; i++) {
					sum += ai[i];
					if (max < ai[i]) {
						max = ai[i];
					}

					if (min > ai[i]) {
						min = ai[i];
					}
				}
				System.out.print(min + " ");
				System.out.print(max + " ");
				System.out.println(sum);
			}
		}
	}
}