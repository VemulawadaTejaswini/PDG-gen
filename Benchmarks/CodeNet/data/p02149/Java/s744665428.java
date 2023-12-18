import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ans = "";

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) ans = "A";
		if (b > a && b > c) ans = "B";
		if (c > a && c > b) ans = "C";

		System.out.println(ans);

	}

}

