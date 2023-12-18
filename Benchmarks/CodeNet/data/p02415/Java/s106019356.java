import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			
			String input = br.readLine();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				String s = String.valueOf(c);
				
				if(isUpperCase(c)) {
					sb.append(s.toLowerCase());
				} else if(isLowerCase(c)) {
					sb.append(s.toUpperCase());
				} else {
					sb.append(c);
				}
			}
			
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean isUpperCase(char c) {
		return 'A' <= c && c <= 'Z';
	}
	
	private static boolean isLowerCase(char c) {
		return 'a' <= c && c <= 'z';
	}
}
