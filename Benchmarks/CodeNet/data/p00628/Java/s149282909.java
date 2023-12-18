import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
		String text;
		String endText = "END OF INPUT";
		while(!(text = br.readLine()).equals(endText)) {
			String[] word = text.split(" ", 0);
			for(int i = 0 ; i < word.length ; i++) {
				System.out.print(word[i].length());
			}
			System.out.println();
		}
	}

}

