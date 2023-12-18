import java.io.*;
import java.util.*;

class Main {
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			int count[] = new int[26];
			Arrays.fill(count, 0);
			while((str=input.readLine()) != null){
				int i = 0;
				str = str.toUpperCase();
				while(i<str.length()) {
					if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
						count[str.charAt(i) - 'A']++;
					}
					i++;
				}
			}
			for (int i=0; i<26 ; i++ ) {
				char x = 'a';
				x += i;
				System.out.println(String.valueOf(x) + " : " + count[i]);
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