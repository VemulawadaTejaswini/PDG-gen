import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] sArray = S.toCharArray();
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < sArray.length; i++) {
			if ((i + 1) % 2 != 0) {
				ans.append(sArray[i]);
			}
		}
		System.out.println(ans.toString());
		sc.close();
	}
}