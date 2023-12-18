import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] list = s.toCharArray();
		int count = 0;

		for (int i = 0; i < s.length() / 2; i++) {
			if (list[i] != list[s.length() - i-1]) {
				count++;
			}

		}

		System.out.println(count);

		sc.close();
	}
}