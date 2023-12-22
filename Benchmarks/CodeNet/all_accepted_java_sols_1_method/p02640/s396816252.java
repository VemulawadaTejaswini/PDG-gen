import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x * 2;
		for (int i = 0; i < x; i++) {
			if (sum < y) {
				sum += 2;
			} else {
				break;
			}
		}
		if (sum == y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
