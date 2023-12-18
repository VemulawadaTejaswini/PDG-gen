import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static String decode (String str) {
		
		String ret = "";
		
		for (int i = 1; i <= 25; i++) {
			boolean flag = false;
			for (String s : str.split(" ")) {
				if (s.charAt(s.length() - 1) == '.')
					s = s.substring(0,s.length() - 1);
				String temp = "";
				for (int j = 0; j < s.length(); j++)
					temp += (char)((str.charAt(j) - 'a' + i) % 26 + 'a');
				if (temp.matches("the|that|this"))
					flag = true;
				ret += temp;
			}
			if (flag) {
				return ret;
			}
			ret = "";
		}
		
		return null;
	}
	
	public static void main (String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String str = sc.nextLine();
			if (str == null) break;
			System.out.println(decode(str));
		}
		
	}
	
}