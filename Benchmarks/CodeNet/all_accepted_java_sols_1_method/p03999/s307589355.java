
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int len_bit = line.length() - 1;
		int con = 0;
		long ans = 0;

		for (int i = 0; i < (1 << len_bit); i++) {
			int[]index = new int[line.length() + 1];
			index[0] = 0;
			con = 1;
			for (int j = 0; j < len_bit; j++) {
				if (((i >> j) & 1) == 1) {
					index[con] = j + 1;
					con++;
				}
			}
			index[con] = line.length();
			for (int j = 0; j < con; j++) {
				ans += Long.parseLong(line.substring(index[j], index[j + 1]));
			}
		}
		System.out.println(ans);

	}




}
