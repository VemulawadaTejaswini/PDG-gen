import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		float c = Float.valueOf(s[0]);
		float d = Float.valueOf(s[1]);
		System.out.println(a / b + " " + a % b + " " + (c / d));
	}
}