import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int ans = 0;
		while (true) {
			int num = s.nextInt();
			num = num * 2;

			for (int a = 1; a < num; a++) {
				for (int i = 2; i + a < num; i++) {
					ans = (i + a) * (i - a + 1);
					if (ans == num)
						count++;
				}
			}

			if (num == 0)
				break;
			System.out.println(count);
		}
	}
}