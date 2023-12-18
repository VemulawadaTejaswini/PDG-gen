import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		int rail[];
		int v1, v2;
		double sum;

		while (sc.hasNext()) {
			sum = 0.0;
			rail = new int[10];
			str = sc.next().split(",");
			for (int i = 0; i < 10; i++) {
				rail[i] = Integer.valueOf(str[i]);
				sum += rail[i];
			}
			v1 = Integer.valueOf(str[10]);
			v2 = Integer.valueOf(str[11]);
			sum = sum * v1 / (v1 + v2);
			for (int i = 0; i < 10; i++) {
				if (sum - rail[i] <= 0) {
					System.out.println(i + 1);
					break;
				}
				sum -= rail[i] * 1.0;
			}
		}
	}
}