import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ans = "";

		for (int i = 0; i < 3; i++) {
			ans += sc.next().charAt(0);
		}

		System.out.println(ans);
		sc.close();
	}

}
