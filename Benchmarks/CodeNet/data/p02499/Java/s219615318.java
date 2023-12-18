import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			String s; 
			int count[] = new int[27], i = 0;
			Arrays.fill(count, 0);
			while((s = br.readLine() )!= null) {
				i = 0;
				s.toUpperCase();
				while(i < s.length()) {
					if(s.charAt(i)>= 'A' && s.charAt(i) <= 'Z')
						count[s.charAt(i)-'A']++;
					i++;
				}
			}
			for(i = 0;i < 26;i++) {
				char y = (char)((int)'a'+i);
				System.out.println(String.valueOf(y) + " : " + count[i]);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}