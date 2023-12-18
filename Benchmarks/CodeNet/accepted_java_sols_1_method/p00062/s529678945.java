import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			String temp = "";
			
			while (s.length() != 1) {
				
				for (int i = 0; i < s.length() - 1; i++)
					temp += String.valueOf(((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10);
				s = temp;
				temp = "";
				
			}
			
			ans.add(Integer.parseInt(s));
			
		}
		
		for (int a : ans) {
			System.out.println(a);
		}

	}

}