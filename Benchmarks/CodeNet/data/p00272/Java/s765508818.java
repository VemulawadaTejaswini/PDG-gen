import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int t = sc.nextInt();
			int n = sc.nextInt();
			if (t == 1) {
				System.out.println(n * 6000);
			} else if (t == 2) {
				System.out.println(n * 4000);
			} else if (t == 3) {
				System.out.println(n * 3000);
			} else {
				System.out.println(n * 2000);
			}
		}
		sc.close();
	}
}