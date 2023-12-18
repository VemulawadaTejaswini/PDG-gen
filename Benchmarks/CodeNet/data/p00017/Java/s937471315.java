import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	
	public static boolean checker (String s) {
		return s.equals("this") || s.equals("the") || s.equals("that");
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						'o','p','q','r','s','t','u','v','w','x','y','z'};
		
		ArrayList<String> ans = new ArrayList<String>();
		boolean flag = false;
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			String dc = "";
			
			main:
			for (int shift = 1; shift <= 25; shift++) {
				dc = "";
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == ' ') {
						dc += ' ';
						continue;
					}
					if (s.charAt(i) == '.') {
						dc += '.';
						continue;
					}
					dc += alp[(s.charAt(i) - '0' - 49 + shift) % 26];
				}
				
				flag = false;
				String temp = "";
				
				for (int i = 0; i < dc.length(); i++) {
					
					if (dc.charAt(i) == '.' || dc.charAt(i) == ' ') {
						flag = checker(temp);
						if (flag) break;
						temp = "";
					} else {
						temp += dc.charAt(i);
					}
					
				}
				
				if (flag) {
					ans.add(dc);
					break main;
				}
				
			}
			
		}
		
		for (String a : ans)
			System.out.println(a);
	}

}