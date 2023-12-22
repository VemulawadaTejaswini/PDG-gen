import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long num = sc.nextLong() - 1;
			String name = "";

			while (num >= 0) {
				int mod = (int) (num % 26);
				name = ((char) ('a' + mod) + name);
				num = num / 26 - 1;
			}
			System.out.println(name);
		}
	}
}
