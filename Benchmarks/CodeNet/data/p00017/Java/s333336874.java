import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						'o','p','q','r','s','t','u','v','w','x','y','z'};
		
		ArrayList<String> ans = new ArrayList<String>();
		boolean isPeriod = false;
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
				
				// 末尾のピリオドを削除
				isPeriod = dc.charAt(dc.length() - 1) == '.';
				if (isPeriod) dc = new StringBuffer(dc).deleteCharAt(dc.length() - 1).toString();
				StringTokenizer st = new StringTokenizer(dc," ");
				flag = false;
				
				while (st.hasMoreTokens()) {
					
					String word = st.nextToken();
					flag = word.equals("the");
					if (flag) break;
					flag = word.equals("this");
					if (flag) break;
					flag = word.equals("that");
					if (flag) break;
				}
				
				if (flag) {
					if (isPeriod) dc += ".";
					ans.add(dc);
					break main;
				}
				
			}
			
		}
		
		for (String a : ans)
			System.out.println(a);
	}

}