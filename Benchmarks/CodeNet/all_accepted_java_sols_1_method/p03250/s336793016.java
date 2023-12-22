import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B, C, res;
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		scanner.close();

		int[] num = { A, B, C };
		Arrays.sort(num);

		res = num[2] * 10 + num[1] + num[0];
		
		System.out.println(res);
	}
}
