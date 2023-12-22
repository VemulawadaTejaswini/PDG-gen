import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] cs = sc.next().toCharArray();
		cs[3] = '8';

		for (char c : cs) {
			System.out.print(c);
		}
		System.out.println();

		sc.close();
	}

}


