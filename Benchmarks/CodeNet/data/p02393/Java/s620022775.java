import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] in = input.split(" ");
		int[] sortNum = new int[in.length];
		for (int i = 0; i < in.length; i++) {
			int chkNum = Integer.parseInt(in[i]);
			if (chkNum >= 1 && chkNum <= 10000) {
				sortNum[i] = chkNum;
				if (i == (in.length - 1)) {
					Arrays.sort(sortNum);
					for (int out : sortNum) {
						System.out.print(out + " ");
					}
				}
			} else {
				break;
			}
		}
	}
}