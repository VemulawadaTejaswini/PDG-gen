import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int index = s.length() - 1;
		if (index % 2 == 0) {
			index--;
		}
		StringBuilder sb = new StringBuilder(s);
		while (index > 0) {
			sb.deleteCharAt(index);
			index -= 2;
		}

		System.out.println(sb.toString());

		sc.close();
	}
}