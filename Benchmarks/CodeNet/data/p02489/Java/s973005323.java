import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vec[] = new int[1000];
		int i = 1;
		for(int j=1;j<1000;j++) {
			vec[i] = sc.nextInt();
			if (vec[i] == 0) {
				// System.out.printf("%d\n", i);
				break;

			}

			i++;

		}

		for (int j = 1; j < i; j++) {
			// System.out.printf("%d\n", i);
			 if (vec[j] == 0)
			 break;
			System.out.printf("Case %d: %d\n", j, vec[j]);

		}
		// System.out.printf("ok %d %d", i, vec[i]);
	}

}