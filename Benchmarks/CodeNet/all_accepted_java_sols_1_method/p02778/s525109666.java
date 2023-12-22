import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int sl = s.length();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < sl; i++) {
				sb.append("x");
			}
			System.out.print(sb.toString());
		}
	}
}