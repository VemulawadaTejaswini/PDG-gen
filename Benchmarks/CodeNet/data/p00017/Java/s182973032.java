import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//????????¶?????????
public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Pattern pThe = Pattern.compile("the");
		Pattern pThis = Pattern.compile("this");
		Pattern pThat = Pattern.compile("that");
		Matcher mThe;
		Matcher mThis;
		Matcher mThat;

		while(sc.hasNext()) {
			//?????????????????¨???
			String str = sc.nextLine();
			String code = "";

			for(int i = 0; i < 26; i++) {
				for(int $ = 0; $ < str.length(); $++) {
					if(str.charAt($) >= 'a' && str.charAt($) < 'z') {
						code += String.valueOf((char)(str.charAt($) + 1));
					} else if(str.charAt($) == 'z') {
						code += 'a';
					} else {
						code += str.charAt($);
					}
				}

				mThe = pThe.matcher(code);
				mThis = pThis.matcher(code);
				mThat = pThat.matcher(code);

				if(mThe.find() || mThis.find() || mThat.find()) {
					System.out.println(code);
					break;
				}

				str = code;
				code = "";

			}

		}
	}

}