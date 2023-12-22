import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			char[] chars = s.next().toCharArray();
			if (chars[0] == '0') return;
			int sum = 0;
			for (char ch : chars) {
				sum += Character.getNumericValue(ch);
			}
			System.out.println(sum);
		}
	}
}