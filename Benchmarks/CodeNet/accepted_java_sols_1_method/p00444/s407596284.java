import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int val = in.nextInt();
			if (val != 0) {
				int oturi = 1000 - val;
				int count = 0;
				while (oturi > 0) {
					count += oturi % 5;
					oturi /= 5;
					count += oturi % 2;
					oturi /= 2;
				}
				System.out.println(count);
			}
		}
	}
}