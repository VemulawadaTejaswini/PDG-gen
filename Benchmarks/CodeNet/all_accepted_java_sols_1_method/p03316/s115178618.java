import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sn = 0;
		int a = n;

		while (a != 0) {
			sn += a % 10;
			a /= 10;
		}

		if(n%sn == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
