import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String W = sc.nextLine();
		String T = "";
		String end = "END_OF_TEXT";


		int ans = 0;

		while (!(T.equals(end))) {
			T = sc.next();
			Pattern ptn = Pattern.compile(W, Pattern.CASE_INSENSITIVE);
			Matcher mc = ptn.matcher(T);
			if(mc.matches()){
				ans++;
			}
		}

		System.out.println(ans);
	}

}