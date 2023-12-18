import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String S = in.readLine();
		int K = Integer.parseInt(in.readLine());
	
		in.close();
		
		char target = S.charAt(K-1);
		char[] str = S.toCharArray();
		for(int i = 0 ;i < str.length; ++i) {
			if(str[i] != target) {
				str[i] = '*';
			}
		}
		String result = new String(str);
		System.out.println(result);
		

	}

}