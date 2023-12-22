import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		sc.close();

		for (int i = 1; ; i++) {
			if (x * i % 360 == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
