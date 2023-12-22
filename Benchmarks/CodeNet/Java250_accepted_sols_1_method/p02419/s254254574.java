import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String W = br.readLine().toLowerCase();
		String END = "END_OF_TEXT";
		int cnt = 0;
		for(;;) {
			String line = br.readLine();
			if(line.equals(END)) {
				break;
			}
			String[] words = line.split(" ");
			for(int i = 0; i < words.length; i++) {
				if(words[i].toLowerCase().equals(W)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}