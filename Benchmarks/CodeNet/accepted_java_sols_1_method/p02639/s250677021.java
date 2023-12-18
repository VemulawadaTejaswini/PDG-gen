import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5];
		for (int i = 0; i < 5; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				System.out.println(i + 1);
				return;
			}
		}
	}
}
