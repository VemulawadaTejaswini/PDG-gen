import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();

		for (int j = 0; j < num.length; j++) {
			if (num[j] == 0) {
				System.out.println(j + 1);
			}
		}
	}
}