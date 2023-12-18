import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String str = br.readLine();

		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++){
			System.out.print(ch[ch.length - 1 - i]);
		}
	}
}