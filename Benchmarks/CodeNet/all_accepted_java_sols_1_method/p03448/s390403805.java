import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				for (int j2 = 0; j2 <= C; j2++) {
					int tmp = 500 * i + 100 * j + 50 * j2;
					if (tmp == X)
						count++;

				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}