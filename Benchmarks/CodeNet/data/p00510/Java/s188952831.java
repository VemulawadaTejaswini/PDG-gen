import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int car = in.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++) {
			car += in.nextInt();
			car -= in.nextInt();
			max = Math.max(max, car);
			if (car < 0) {
				car = 0;
				break;
			}
		}
		System.out.println(car);
	}
}