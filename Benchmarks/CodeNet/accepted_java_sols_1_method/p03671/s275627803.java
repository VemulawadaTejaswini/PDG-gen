import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int A = reader.nextInt();
		int B = reader.nextInt();
		int C = reader.nextInt();
		int ans = A + C;
		int AB = A + B;
		int BC = B + C;
		ans = Math.min(ans, AB);
		ans = Math.min(ans, BC);


		System.out.println(ans);
		reader.close();

	}
}



