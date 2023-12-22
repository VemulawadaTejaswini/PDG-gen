import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String min = sc.next();
		for (int i = 1; i < n; i++) {
			String line = sc.next();
			if (line.compareTo(min) < 0)
				min = line;
		}
		System.out.println(min);
	}
}