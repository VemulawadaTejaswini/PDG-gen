import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String[] s = sc.nextLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int counter = 0;
			for (int i = a; i <= b; i++) {
				if (c % i == 0) {
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
}