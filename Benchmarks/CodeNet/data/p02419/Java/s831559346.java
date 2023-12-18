package Vol0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int cnt = 0;
	private static String keyword;
	private static final String EOF = "END_OF_TEXT";
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		keyword = (" " + br.readLine() + " ").toUpperCase();
		
		String line;
		while (!(line = br.readLine()).equals(EOF)) {
			line = (" " + line + " ").toUpperCase();
			int str = -1;
			while((str = line.indexOf(keyword))!=-1){
				cnt++;
				line = line.substring(str);
			}
		}
		System.out.println(cnt);
	}
}