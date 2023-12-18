import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static String decode (String str) {
		
		String ret = "";
		
		for (int i = 1; i <= 25; i++) {
			boolean flag = false;
			ret = "";
			String temp = "";
			for (int j = 0; j < str.length(); j++) {
				int num = (str.charAt(j) - 'a' + i) % 26 + 'a';
//				System.out.println(num);
				if (97 <= num && num <= 122) {
					ret += (char)num;
					temp += (char)num;
				} else {
					ret += str.charAt(j);
					if (temp.matches("the|that|this"))
						flag = true;
					temp = "";
				}
			}
//			System.out.println(ret);
			if (flag) return ret;
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