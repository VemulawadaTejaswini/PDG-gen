import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] c = new int[3];
		int[] len = new int[3];
		while (true) {
			for (int i = 0; i < 3; ++i) {
				len[i] = sc.nextInt();
			}
			Arrays.sort(len);
			if (len[0] + len[1] <= len[2]) {
				System.out.println((c[0] + c[1] + c[2]) + " " + c[0] + " " + c[1] + " " + c[2]);
				break;
			}
			int s = len[0] * len[0] + len[1] * len[1];
			if (s < len[2] * len[2]) {
				c[2]++;
			} else if (s == len[2] * len[2]) {
				c[0]++;
			} else {
				c[1]++;
			}
		}
	}

}