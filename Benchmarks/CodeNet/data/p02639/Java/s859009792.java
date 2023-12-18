import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			if (sc.nextInt() == 0) {
				count++;
			}

		}
		System.out.print(count);
		sc.close();
	}

}
