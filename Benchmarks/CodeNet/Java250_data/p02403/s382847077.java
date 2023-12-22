import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			for (int i = 0; i < a; i++) {
				for (int c = 0; c < b; c++) {
					System.out.printf("#");
				}
				System.out.println();
			}
		    System.out.println();
		}
     }
}
