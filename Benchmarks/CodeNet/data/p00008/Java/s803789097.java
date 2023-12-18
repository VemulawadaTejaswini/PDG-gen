import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int inputNum = 0;
		int count = 0;

		while (sc.hasNext()) {
			inputNum = sc.nextInt();
			count = 0;
			for (int i = 0; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					for (int k = 0; k <= 9; k++) {
						for (int l = 0; l <= 9; l++) {
							if (inputNum == i + j + k + l)
								count += 1;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}