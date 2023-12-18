import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String ans = "";
		if (n < 1000) {
			ans = "ABC";
		} else {
			ans = "ABD";
		}

		System.out.println(ans);

	}

}