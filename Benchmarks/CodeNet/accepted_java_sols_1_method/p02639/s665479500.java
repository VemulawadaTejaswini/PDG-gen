import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();
		int[] X = new int[]{x1, x2, x3, x4, x5};
		for (int i = 0; i < 5; i++) {
			if (X[i] == 0) {
				System.out.println(i + 1);
			}
		}
	}

}