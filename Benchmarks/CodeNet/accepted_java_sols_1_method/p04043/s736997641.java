import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = "575";
			s = s.replaceFirst(sc.next(), "");
			s = s.replaceFirst(sc.next(), "");
			s = s.replaceFirst(sc.next(), "");
			System.out.println(s.length() == 0 ? "YES" : "NO");
		}
	}
}
