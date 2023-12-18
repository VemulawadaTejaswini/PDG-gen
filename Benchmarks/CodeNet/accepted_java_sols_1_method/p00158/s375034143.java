import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int q = in.nextInt();
			if (q != 0) {
				int counter = 0;
				while (q != 1) {
					if (q % 2 == 0) {
						q /= 2;
					} else {
						q *= 3;
						q++;
					}
					counter++;
				}
				System.out.println(counter);
			}
		}
	}
}