import java.io.*;
import java.math.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> ans = new ArrayList<String>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			// 入力された値を２進数に変換し、反転させた文字列str
			String str = new StringBuffer(BigInteger.valueOf((Integer.parseInt(s))).toString(2)).reverse().toString();
			String a = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					a += String.valueOf((int)Math.pow(2, i));
					if (i != str.length() - 1)
						a += " ";
				}
			}
			ans.add(a);
		}
		for (String p : ans) {
			System.out.println(p);
		}
	}

}