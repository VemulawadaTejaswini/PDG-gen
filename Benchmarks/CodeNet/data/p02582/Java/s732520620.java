import java.util.Scanner;


public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s = sc.next();
		int result = 0;
		if (s.contains("R")) {
			result = 1;
		}
		if (s.contains("RR")) {
			result = 2;
		}
		if (s.contains("RRR")) {
			result = 3;
		}
		System.out.println(result);
	}

}
