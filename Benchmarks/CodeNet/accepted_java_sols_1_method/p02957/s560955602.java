import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int k = (a+b)/2;
		String ans = "";

		if ((a+b)%2 == 0 && Math.abs(a-k) == Math.abs(b-k)) {

			ans = String.valueOf(k);

		} else {
			ans = "IMPOSSIBLE";
		}

		System.out.println(ans);
		sc.close();

	}

}
