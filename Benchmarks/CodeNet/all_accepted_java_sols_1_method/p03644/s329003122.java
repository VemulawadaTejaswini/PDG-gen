import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();

		sc.close();

		int ans = 0, i = 0, tmp = 1;

		while (true) {
			if (n < tmp)
				break;
			if (n == tmp)
				ans = tmp;
			tmp *= 2;
		}

		if (ans == 0)
			ans = tmp / 2;
		System.out.println(ans);

	}

}
