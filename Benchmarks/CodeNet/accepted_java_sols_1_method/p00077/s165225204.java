import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		
		while (true) {
			
			String out = "";
			String in = br.readLine();
			if (in == null) break;
			
			for (int i = 0; i < in.length(); i++) {
				if (in.charAt(i) == '@') {
					
					for (int j = 0; j < in.charAt(i + 1) - '0'; j++)
						out += String.valueOf(in.charAt(i + 2));
					i += 2;
				} else
					out += String.valueOf(in.charAt(i));
			}
			ans.add(out);
			
		}
		
		for (String a : ans)
			System.out.println(a);
		
	}
	
}