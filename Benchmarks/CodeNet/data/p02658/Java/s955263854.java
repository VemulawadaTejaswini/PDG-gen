import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrayNum = scan.nextInt();
		long[] array = new long[arrayNum];

		for (int i = 0; i < array.length; i++) {
			;
			array[i] = scan.nextLong();
		}
		scan.close();

		long num = 1;
		for (long i : array) {
			num *= i;
		}
		long num2 = (long) Math.pow(10, 18);
		if (num < num2) {
			System.out.println(num);
		} else if (num >= num2) {
			System.out.println(-1);
		}
	}

}