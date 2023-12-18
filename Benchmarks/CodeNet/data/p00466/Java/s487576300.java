import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int S = sc.nextInt();
			if (S == 0) break;
			for (int i = 0; i < 9; ++i) {
				S -= sc.nextInt();
			}
			System.out.println(S);
		}
	}

}