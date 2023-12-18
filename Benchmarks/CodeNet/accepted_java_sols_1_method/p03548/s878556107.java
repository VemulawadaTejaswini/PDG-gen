import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();

			int ans = (X - Z) / (Y + Z);

			System.out.println(ans);

		}
	}
}