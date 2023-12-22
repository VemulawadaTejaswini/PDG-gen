import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			String x = String.valueOf(a + b);
			System.out.println(x.length());
		}

	}

}