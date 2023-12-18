import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();

		int divisor = 0;

		for (; a <=b; a++) {
			if (c%a == 0) divisor++;
		}
		System.out.println(divisor);
	}
}

