import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String w = sc.next().toUpperCase();
			int sum = 0;
			while (true) {
				String t = sc.next();
				if (t.equals("END_OF_TEXT")) {
					break;
				}
				if (w.equals(t.toUpperCase())) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}

