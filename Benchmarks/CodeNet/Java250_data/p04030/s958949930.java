import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//B - 文字列大好きいろはちゃんイージー / Iroha Loves Strings (ABC Edition)

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		List <String> ans = new ArrayList<String>();

		for (int i = 0; i < s.length();i++ ) {
			if(s.charAt(i) == '0') {
				ans.add("0");
			} else if (s.charAt(i) == '1') {
				ans.add("1");
			} else {
				if ( ans.size() != 0) {
					ans.remove(ans.size() -1);
			}
			}
		}
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i));
		}
	}
}
