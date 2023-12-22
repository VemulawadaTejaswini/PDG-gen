import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int[] abc = new int[26];
		while((line = br.readLine()) != null){
			for (int i = 0; i<line.length() ; i++ ) {
				char c = line.charAt(i);
				c = Character.toLowerCase(c);
				char cc ='a';
				for (int j = 0; j<abc.length ; j++ ) {
					if (cc == c) {
						abc[j]++;
					}
						cc++;
				}
			}
		}

		char c ='a';
		for (int i = 0 ; i<abc.length ; i++ ) {
			System.out.println(c+" : "+abc[i]);
			c++;
		}
	}
}