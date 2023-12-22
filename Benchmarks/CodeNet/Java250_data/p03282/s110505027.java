import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		String[] strs = read(2);
		
		String s = strs[0];
		long k = Long.parseLong(strs[1]);
		
		char c = '1';
		for (int i = 0; i < s.length() && i < k; i++) {
			c = s.charAt(i);
			if (c != '1') {
				break;
			}
		}
		
		System.out.println(c);
	}
	
	private static String[] read(int len) {
		List<String> strList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			for (int i = 0; i < len; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
		
		return strList.toArray(new String[0]);
	}
}
