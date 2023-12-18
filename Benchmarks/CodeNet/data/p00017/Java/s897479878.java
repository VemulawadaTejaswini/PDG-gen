import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
//		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		String[] words = {"the","this","that"};
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		
		String code = "";
		while(true) {
			String s = br.readLine();
			if (s == null) break;
			code += s;
		}
		
		String decode = "";
		
		for (int shift = 1; shift <= 25; shift++) {
			
			for (int i = 0; i < code.length(); i++) {
				
				String s = String.valueOf(code.charAt(i));
				if (s.equals(".")) {
					decode += ".";
					continue;
				} else if (s.equals(" ")) {
					decode += " ";
					continue;
				}
				if (alp.indexOf(s) == 0 || alp.indexOf(s) == 1) continue;
				int index = (alp.indexOf(s) + shift) % 26;
				decode += alp.charAt(index);
				
			}
			
			StringTokenizer st = new StringTokenizer(decode," ");
			boolean flag = false;
			
			while (st.hasMoreTokens()) {
				
				String tmp = st.nextToken();
				
				for (int j = 0; j < words.length; j++) {
					if (words[j].equals(tmp)) {
						flag = true;
						break;
					}
				}
				
				if (flag) break;
				
			}
			
			if (flag) {
				System.out.println(decode);
				break;
			}
			decode = "";
			
		}
	}
	
}