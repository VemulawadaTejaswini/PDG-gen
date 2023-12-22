import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();

			char[] s =  data1.toCharArray();
			char[] t =  data2.toCharArray();

			long count = 0;
			for (int i = 0; i < s.length; i++) {
				if (s[i] != t[i]) {
					count++;
				}
			}

			System.out.println(count);
		}
	}
}