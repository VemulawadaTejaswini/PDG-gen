import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = input.readLine();
			int count[] = new int[26];
			Arrays.fill(count, 0);
			int i = 0;
			str = str.toUpperCase();
			while(i<str.length()) {
				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					count[str.charAt(i) - 'A']++;
				}
				i++;
			}
			for (int j=0; j<26 ;j++ ) {
				char x = 'a';
				x += j;
				System.out.println(String.valueOf(x) + " : " + count[j]);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
	}
		
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
		

	}
}