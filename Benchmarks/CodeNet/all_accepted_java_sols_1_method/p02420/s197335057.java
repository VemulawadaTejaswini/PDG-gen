import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();
			if (line.equals("-")) {break;}
			int len = line.length();
			String word = line;
			String hst = br.readLine();
			int m = Integer.parseInt(hst);
			for (int i = 0; i<m ; i++) {
				String st = br.readLine();
				int h = Integer.parseInt(st);
				char[] c = word.toCharArray();
				word = "";
				
				for (int j = h; j < h+len ; j++ ) {
					if(j < len){
						word += String.valueOf(c[j]);
					}else{
						word += String.valueOf(c[j-len]);
					}
					
				}

			}	
			System.out.println(word);
		}
	}
}