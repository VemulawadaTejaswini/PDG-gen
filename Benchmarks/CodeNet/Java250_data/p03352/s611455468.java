import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int max = 0;

		for (int i = 1; i <= Math.sqrt(x); i++) {
			int tmp = 1;
			for (int j = 2; j < 10; j++) {
				if (tmp * i > x) {
					break;
				}
				tmp *= i;
				if (max < tmp) {
					max = tmp;
				}
			}

		}
		System.out.print(max);

	}
}
