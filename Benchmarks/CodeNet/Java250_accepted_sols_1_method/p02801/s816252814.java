import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String mozi = scan.next();
		char[] c = mozi.toCharArray();

		for(char c1:c) {
			c1++;
			System.out.println(c1);
		}

		scan.close();

	}

}
