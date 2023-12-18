import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int min = 1000000;
		int max = 0;
		int num;
		int x;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			x = sc.nextInt();
			if (x < min) {
				min = x;
				max = x;
			} else if (max < x)
				max = x;
		}
		System.out.println((max - min));
	}
}