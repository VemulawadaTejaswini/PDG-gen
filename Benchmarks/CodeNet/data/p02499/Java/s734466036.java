

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main{
	public static int[] array = new int[26];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		createarray();
		String input = br.readLine();
		for (int i = 0;i < input.length();i++) {
			String tmp = input.toLowerCase();
			Character temp = tmp.charAt(i);
			int num = temp - 'a';
			array[num]++;
		}
		
		for (int i = 0;i < array.length;i++) {
			System.out.println((char)i + " : "+array[i]);
		}
	}
	
	public static void createarray() {
		for (int i = 0;i < 26; i++) {
			array[i] = 0;
		}
	}

}