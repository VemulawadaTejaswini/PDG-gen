import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "******************************************************************************************************************************************************************************************************";
		int count;
		while ((count = in.nextInt()) > 0) {
			int[] ice = new int[10];
			while (count-- > 0) {
				ice[in.nextInt()]++;
			}
			for (int b : ice) {
				if (b != 0) {
					System.out.println(s.substring(0, b));
				} else {
					System.out.println('-');
				}
			}
		}
	}
}