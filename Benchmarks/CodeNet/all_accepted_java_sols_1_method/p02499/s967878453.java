import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ary = new int[26];
		String in;
		while ((in=br.readLine()) != null) {
			in = in.toLowerCase();
			for (int i=0; i<in.length(); i++) {
				if ('a' <= in.charAt(i) && in.charAt(i) <= 'z') ary[in.charAt(i)-'a']++;
			}
		}
		char x = 'a';
		for (int i=0; i<ary.length; i++) System.out.println((char)(x+i) + " : " + ary[i]);
	}
}