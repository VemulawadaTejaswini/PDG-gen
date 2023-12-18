import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String s = in.readLine();
		int n = Integer.parseInt(s);
		int[] dctnr = new int[toHash("TTTTTTTTTTTT")];
		
		String str;
		for (int i = 0; i < n; i++) {
			s = in.readLine();
			str = s.split(" ") [1];
			if(s.charAt(0) == 'i') {
				dctnr[toHash(str)] = 1;
			} else if(s.charAt(0) == 'f') {
				String p = dctnr[toHash(str)] == 1 ? "yes" : "no";
				System.out.println(p);
			}
		}
	}	
	static int toHash(String s) {
		int n = s.length();
		String temp = "";
		for (int i = 0; i < n; i++) {
			int t = s.charAt(i);
			temp = temp +  "" + t;
		}
		return Integer.parseInt(temp);
	}
	
}
