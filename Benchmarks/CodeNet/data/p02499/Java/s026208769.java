import java.io.*;
import java.util.*;
public class Main {
	
	// a : 49
	// z : 74
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int index;
		int[] cnt = new int[26];
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
					'o','p','q','r','s','t','u','v','w','x','y','z'};
		
		str = br.readLine().toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			index = str.charAt(i) - '0';
			if (index < 0) continue;
			cnt[index - 49]++;
		}
		for(int i = 0; i < cnt.length; i++) {
			System.out.println(String.valueOf(c[i]) + " : " + cnt[i]);
		}
	}

}