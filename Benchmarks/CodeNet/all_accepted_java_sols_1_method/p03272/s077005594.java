import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int trainLength = sc.nextInt();
		int target = sc.nextInt();

		System.out.println((trainLength - target) + 1);

	}
}
