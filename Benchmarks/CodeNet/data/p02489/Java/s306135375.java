import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int i = 1;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		while (a != 0) {
			System.out.println("Case " + i + ": " + a);
			i++;
			sc = new Scanner(System.in);
			a = sc.nextInt();
			if (a == 0) {
				break;
			}
		}

	}

}