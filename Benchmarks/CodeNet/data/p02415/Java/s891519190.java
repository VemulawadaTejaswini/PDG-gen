import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str = br.readLine();
		char[] moji = str.toCharArray();
		
		for(int i = 0; i < moji.length; i++) {
			if (Character.isUpperCase(moji[i])) {
				sb.append(Character.toLowerCase(moji[i]));
			} else {
				sb.append(Character.toUpperCase(moji[i]));
			}
		}
		System.out.println(sb.toString());
	}
}