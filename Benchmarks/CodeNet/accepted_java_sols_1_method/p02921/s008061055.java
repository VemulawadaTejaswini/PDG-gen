import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (s.charAt(i) == t.charAt(i))
				count++;
		}
		System.out.println(count);
	}

}
