import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		sb.toString().toLowerCase();
		int[] cnt = new int[26];
		for(int i=0; i<sb.length(); i++)		cnt[sb.charAt(i)-'a']++;
		char chr = 'a';
		for(int i=0; i<26; i++)	System.out.println(chr++ + ":" + cnt[i]);
	}
}