import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		int answer;

		if (n % 2 != 0) {
			answer = n * 2;
		} else {
			answer = n;
		}

		System.out.println(answer);
	}

}
