import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		if (e - a <= k) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}
