import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int ans = a + b;
			int i = 0;
			while (ans != 0) {
				ans /= 10;
				i++;
			}
			System.out.println(i);
		}

	}

}