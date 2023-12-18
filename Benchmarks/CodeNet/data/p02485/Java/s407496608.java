import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int x = scan.nextInt();
			if (x == 0)
				break;
			int sum = 0;
			for (int i = Integer.toString(x).length(); i > 0; i--) {
				int num = 1;
				for (int j = 1; j < i; j++) {
					num *= 10;
				}
				sum += x / num;
				x -= (x / num) * num;
			}
			System.out.println(sum);
		}
	}
}