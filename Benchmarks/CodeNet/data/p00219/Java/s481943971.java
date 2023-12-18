import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int count;
		while ((count = in.nextInt()) > 0) {
			int[] ice = new int[10];
			while (count-- > 0) {
				ice[in.nextInt()]++;
			}
			for (int b : ice) {
				sb.setLength(0);
				for (int j = 0; j < b; j++) {
					sb.append('*');
				}
				if (sb.length() != 0) {
					System.out.println(sb);
				} else {
					System.out.println('-');
				}
			}
		}
	}
}