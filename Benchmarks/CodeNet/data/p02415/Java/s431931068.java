import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] chr = null;
		
		if(str != null && str.length() < 1200) {
			chr = str.toCharArray();
			for (int i = 0; i < chr.length; i++) {
				chr[i] = getReverseCase(chr[i]);
			}
		}
		
		System.out.println(String.valueOf(chr));
	}
	
	public static char getReverseCase(char c) {
		String str = String.valueOf(c);
		if (str.equals(str.toUpperCase())) return str.toLowerCase().toCharArray()[0];
		if (str.equals(str.toLowerCase())) return str.toUpperCase().toCharArray()[0];
		return c;
	}
}