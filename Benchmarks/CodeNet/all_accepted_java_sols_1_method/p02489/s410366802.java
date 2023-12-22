import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1;; i++) {
			int x = sc.nextInt();
			if (x == 0)
				break;
			System.out.print("Case ");
			System.out.print(i);
			System.out.print(": ");
			System.out.println(x);
		}
	}
}