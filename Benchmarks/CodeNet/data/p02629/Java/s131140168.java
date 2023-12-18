import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long n = sc.nextLong();

			StringBuilder sb = new StringBuilder();
			while (n != 0) {
				char amari = (char) (n % 26 + 96);

				sb.insert(0, amari);

				n = n / 26;

			}

			System.out.println(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
