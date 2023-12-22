import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		scan.close();

		String[] sArray = S.split("");
		String[] tArray = T.split("");

		int count = 0;
		for (int i = 0; i < sArray.length; i++) {
			if (!sArray[i].equals(tArray[i])) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}