import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		long sum = 1;
		long max = (long) Math.pow(10, 18);

		if (count >= 2) {
			for (int i = 0 ; i < count ; i++) {
				long value = scan.nextLong();
				if (value == 0) {
					sum = 0;
					break;
				}
				if (sum != -1 && sum <= max / value) {
					sum *= value;
				}
				else sum = -1;
			}
		}
			scan.close();
			System.out.println(sum);
	}
}