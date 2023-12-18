import java.util.Arrays;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			int []ThreeNumbers;
			ThreeNumbers = new int[3];

			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				ThreeNumbers[i] = scan.nextInt();
			}

			Arrays.sort(ThreeNumbers);
		System.out.println(ThreeNumbers[0] + " " + ThreeNumbers[1] + " " + ThreeNumbers[2]);

	}

}