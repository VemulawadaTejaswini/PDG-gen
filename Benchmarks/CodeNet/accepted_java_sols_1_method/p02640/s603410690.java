import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		if(y % 2 != 0) {
			System.out.println("No");
		} else {
			for(int i = 0; i <= x; i++) {
				sum = i * 2 + (x - i) * 4;
				if(sum == y) {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}
	}
}
