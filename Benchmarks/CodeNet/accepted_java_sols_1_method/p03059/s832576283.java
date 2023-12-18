import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			String str;
			int A, B, result = 0;
			float T;
			Scanner scanner = new Scanner(System.in);

			str = scanner.nextLine();

			A = Integer.parseInt(str.split(" ")[0]);
			B = Integer.parseInt(str.split(" ")[1]);
			T = Integer.parseInt(str.split(" ")[2]);

			for (int i = A; i < T + 0.5; i = i + A) {
				result += B;
			}

			System.out.print(result);

			scanner.close();
		}
}
