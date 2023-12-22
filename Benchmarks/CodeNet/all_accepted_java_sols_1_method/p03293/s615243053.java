import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		String judge = "No";
 
		int l = S.length();
 
		for (int i = 0; i < l; i++) {
			String end = S.substring(l-1,l);
			S = S.substring(0,l-1);
			S = end + S;
			if (T.equals(S)) {
				judge = "Yes";
				break;
			}
		}
		System.out.println(judge);
	}
}
