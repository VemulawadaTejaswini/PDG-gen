import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println( digit(a, b) );
		}

	}
	private static int digit(int a, int b) {
		int dg = Integer.toString(a + b).length();
		return dg;
	}
}
