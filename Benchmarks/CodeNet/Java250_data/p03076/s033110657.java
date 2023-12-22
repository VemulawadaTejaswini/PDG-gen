
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] orders = new int[5];

		for(int i = 0 ; i < orders.length; i++) {
			orders[i] = scanner.nextInt();
		}

		int last_order = 0;
		int devide_remainder = 10;

		for(int i = 0; i < orders.length; i++) {
			int num = orders[i] % 10;
			if(num < devide_remainder && num != 0) {
				last_order = i;
				devide_remainder = num;
			}
		}

		int sum = 0;

		for(int i = 0; i < orders.length; i++) {
			int num = orders[i] % 10;

			if(i == last_order || num == 0) {
				sum += orders[i];
			}else {
				sum += orders[i] / 10 * 10 + 10;
			}
		}

		System.out.println(sum);
	}
}
