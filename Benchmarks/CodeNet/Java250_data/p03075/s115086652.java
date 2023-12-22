import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int[] ia = new int[5];
		ia[0] = sc.nextInt();
		ia[1] = sc.nextInt();
		ia[2] = sc.nextInt();
		ia[3] = sc.nextInt();
		ia[4] = sc.nextInt();
		int k = sc.nextInt();

		Arrays.sort(ia);


		if (ia[4] - ia[0] > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}