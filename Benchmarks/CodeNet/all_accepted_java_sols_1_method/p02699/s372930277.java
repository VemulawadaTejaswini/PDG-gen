import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int w = sc.nextInt();
		sc.close();

		if (w >= s) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
	}
}
