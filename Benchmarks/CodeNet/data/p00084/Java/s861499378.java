import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		String tpp = stdin.next();
		Pattern pattern = Pattern.compile("[,.\\s]");
		String[] s = pattern.split(tpp);
		for(int i = 0; i <s.length; i++) {
			if(s[i].length() > 2 && s[i].length() < 7) {
				System.out.print(s[i] + " ");
			}
		}


	}


}