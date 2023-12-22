import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hp = sc.nextInt();
		int n = sc.nextInt();
		int td = 0;

		for(int i = 0; i < n; i++) {
			td += sc.nextInt();
		}

		System.out.println(hp <= td ? "Yes" : "No");
	}
}