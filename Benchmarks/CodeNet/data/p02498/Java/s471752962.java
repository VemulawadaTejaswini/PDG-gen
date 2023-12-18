import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String words = in.readLine();
        char [] word = words.toCharArray();
        String result = "";

        for (int i = 0; i < word.length; i++) {
        	if (Character.isLowerCase(word[i])) {
        		result += (String.valueOf(word[i])).toUpperCase();
        	} else {
        		result += (String.valueOf(word[i])).toLowerCase();
        	}
        }

        System.out.println(result);

	}

}