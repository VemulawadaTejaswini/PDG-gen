import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		scanner.close();

		int[] bunsetsu = new int[3];
		bunsetsu[0] = A;
		bunsetsu[1] = B;
		bunsetsu[2] = C;

		Arrays.sort(bunsetsu);

		if (bunsetsu[0] != 5 || bunsetsu[1] != 5 || bunsetsu[2] != 7) {
			System.out.println("NO");
			return;
		}

		System.out.println("YES");

	}

}
