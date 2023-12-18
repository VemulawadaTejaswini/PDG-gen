import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] alp = new int[26];
		boolean flag = true;

		while (flag) {
			String line = br.readLine();
			line = line.toLowerCase();
			char[] c = line.toCharArray();
			for (int i=0; i<c.length; i++) {
				if (c[i] >= 'a' && c[i] <= 'z')
					alp[c[i]-'a']++;
				else if (c[i] == '.')
					flag = false;
			}
		}

		for (int i=0; i<26; i++) {
			System.out.println((char)('a'+i)+" : "+alp[i]);
		}

		br.close();
	}
}