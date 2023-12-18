import java.util.Scanner;

public class Main {

	static int Count(int x) {
		int y = (int) Math.log10(x) + 1;
		return y;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int x = Count(a + b);
			System.out.println(x);
		}
	}

}