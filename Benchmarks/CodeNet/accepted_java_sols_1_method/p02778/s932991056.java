import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String str = "",ans = "";

		Scanner sc = new Scanner(System.in);

		str = sc.next();


		for (int i = 0; i < str.length(); i++) {
			ans += "x";
		}

		System.out.println(ans);

	}

}
