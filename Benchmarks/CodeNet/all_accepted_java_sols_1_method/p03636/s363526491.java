import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] strArray = S.toCharArray();
		System.out.println(strArray[0] + String.valueOf(strArray.length - 2) + strArray[strArray.length - 1]);
		sc.close();
	}
}