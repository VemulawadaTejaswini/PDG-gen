import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;

		while ((input = br.readLine()) != null) {
			char[] charArr = input.toCharArray();

			for (int i = 1; i <= 26; i++) {
				for (int j = 0; j < charArr.length; j++) {
					if (!isSpecialChar(charArr[j])) {
						int index = charArr[j] - 'a' + 1;
						index -= index >= 26 ? 26 : 0;
						charArr[j] = (char)('a' + index);
					}else{
						continue;
					}
				}

				String str = String.valueOf(charArr);
				boolean hasTHE = (str.indexOf("the") != -1) ? true : false;
				boolean hasTHAT = (str.indexOf("that") != -1) ? true : false;
				boolean hasTHIS = (str.indexOf("this") != -1) ? true : false;

				if(hasTHE || hasTHAT || hasTHIS){
					System.out.println(str);
				}
 			}
		}
	}

	private static boolean isSpecialChar(char c) {
		Character ch = Character.valueOf(c);
		Character sp = Character.valueOf(' ');
		Character dot = Character.valueOf('.');
		return (ch.equals(sp) || ch.equals(dot));
	}
}