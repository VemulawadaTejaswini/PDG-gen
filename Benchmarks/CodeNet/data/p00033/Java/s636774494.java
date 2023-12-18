import java.util.Scanner;

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		int n = scan.nextInt();
		int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		for (int c = 0; c < n; c++) {
			for (int i = 0; i < input.length; i++) {
				if (a < input[i]) {
					a = input[i];
				} else if (b < input[i]) {
					b = input[i];
				} else {
					System.out.println("NO");
					break;
				}
				if (i == input.length - 1) {
					System.out.println("YES");
				}
			}
		}
	}
}