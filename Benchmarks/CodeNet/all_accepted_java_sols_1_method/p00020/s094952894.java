import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		char ch[] = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {	
			if(Character.isLetter(ch[i])) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		for(int i = 0; i < s.length(); i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
}