import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		String ans = null;

		for (int i = S.length() - T.length(); i >= 0; i--){
			String part = S.substring(i, i + T.length());
			boolean match = true;
			for (int j=0; j < part.length(); j++){
				if (part.charAt(j) != '?' && part.charAt(j) != T.charAt(j)){
					match = false;
					break;
				}
			}
			if (match){
				StringBuilder sb = new StringBuilder();
				sb.append(S);
				sb.replace(i, i+T.length(), T);
				ans = sb.toString().replace("?", "a");
				break;
			}
		}

		if (ans == null){
			ans = "UNRESTORABLE";
		}
		System.out.println(ans);
	}
}
