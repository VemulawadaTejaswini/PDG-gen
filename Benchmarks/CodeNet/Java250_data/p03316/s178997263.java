import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String n = String.valueOf(N);

		int num = 0;

		for (int i = 0; i < n.length(); i++) {
			num += Integer.valueOf(String.valueOf(n.charAt(i)));
		}

		System.out.println(N % num == 0 ? "Yes" : "No");

	}

}