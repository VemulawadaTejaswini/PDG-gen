
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			char before = ' ';
			int result = 0;
			for(char c : s.toCharArray()) {
				if (before == 'A') {
					result++;
					before = ' ';
				} else if (c == before) {
					before = 'A';
				} else {
					before = c;
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
