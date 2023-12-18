import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int x = sc.nextInt();
		int a = 0;
		for (int i = 0; i <= x+1; i++) {
			a += i;
			if (x <= a) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
