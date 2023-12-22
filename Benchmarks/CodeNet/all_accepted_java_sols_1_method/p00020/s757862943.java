import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		/*
		System.out.println(str.toUpperCase());
		*/

		char text[] = str.toCharArray();

		for(int i=0; i<text.length; i++){
			if('a' <= text[i] && text[i] <= 'z'){
				text[i] = (char)(text[i] - 'a' + 'A');
			}
		}
		System.out.println(text);
	}
}