import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		if (n <= 100) {
			int ai[] = new int[n];
			for (int i = 0; i < ai.length; i++) {
				ai[i] = sc.nextInt();
				if (ai[i] >= 0 && ai[i] <= 1000) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}

			if (flag == true) {
				int length = ai.length - 1;
				for (int j = length; j >= 0; j--) {
					if (j == 0) {
						System.out.println(ai[j]);
					} else {

						System.out.print(ai[j] + " ");
					}

				}
			}

		}

	}

}