package volume10020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String lower_str = str.toLowerCase();
		int counter[] = new int[26];
		for(int i=0; i<lower_str.length(); i++){
			char ch = lower_str.charAt(i);
			int num = ch - 'a';
			if(num >=0 && num <=25){
				counter[num]++; 
			}		
		}
		for(int i=0; i<counter.length; i++){
			System.out.println((char)(i+'a') + " : " +counter[i]);
		}
	}
}