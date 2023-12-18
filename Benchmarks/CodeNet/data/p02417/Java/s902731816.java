import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
					
		String str;
		
		char l;
		char s;
		
		int sum[] = new int[26];
		
		while(true) {
			l = 'A';
			s = 'a';
			
			str = br.readLine();
			
			if (str.length() == 0) break;
			char ch[] = str.toCharArray();
			for(int i = 0; i <= ('z' - 'a'); i++){
				for(int j = 0; j < ch.length; j++){
					if(ch[j] == l || ch[j] == s){
						sum[i]++;
					}
				}
				l++;
				s++;
			}
		}
		
		for(int i = 0; i < 26; i++){
			System.out.println(s + " : " + sum[i]);
			l++;
			s++;
		}
	}
}