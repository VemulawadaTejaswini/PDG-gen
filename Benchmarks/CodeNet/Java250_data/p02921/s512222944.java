import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		char[] sArray = S.toCharArray();
		char[] tArray = T.toCharArray();
		int count = 0;
		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i] == tArray[i]) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}