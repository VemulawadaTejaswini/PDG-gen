import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] spi = new String[n];
		for (int i = 0; i < spi.length; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			spi[i] = s + "_" + (1100 - p) + "_" + (i + 1);
		}
		sc.close();

		Arrays.sort(spi);

		for (String s : spi) {
			System.out.println(s.split("_")[2]);
		}
	}
}
