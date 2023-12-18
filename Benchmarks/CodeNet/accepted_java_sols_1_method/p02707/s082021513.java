import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int employee = sc.nextInt();
		int[] results = new int[employee];
		for (int i = 0; i < employee - 1; i++) {
			int boss = sc.nextInt();
			results[boss - 1]++;
		}
		sc.close();
		for (int result : results) {
			System.out.println(result);
		}
	}

}
