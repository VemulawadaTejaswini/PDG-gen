import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 111; i < 1000; i+=111) {
			if (i >= n) {
				System.out.println(i);
				return;
			}
		}
	}
}
