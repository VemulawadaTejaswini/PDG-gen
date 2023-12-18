

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(reverse(str));
	}

	public static String reverse(String source) {
		StringBuffer dest = new StringBuffer();
		for (int i = source.length() - 1; i >= 0; i--) {
			dest.append(source.charAt(i));
		}
		return dest.toString();
	}
}