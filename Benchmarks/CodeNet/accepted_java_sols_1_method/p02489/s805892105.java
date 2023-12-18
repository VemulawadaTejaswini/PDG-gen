import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int i = 0;

		while (true) {
			a = sc.nextInt();
			if (a == 0)
				break;
			i++;
			System.out.printf("Case %d: %d\n", i, a);
		}
	}
}