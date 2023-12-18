import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
					
		String str, str2;
		
		str = br.readLine();
		str.toLowerCase();
		
		char l;
		char s;
		
		
		l = 'A';
		s = 'a';

		int sum = 0;
		
		char ch[] = str.toCharArray();
		
		while(true){
			str2 = br.readLine();
			str2.toLowerCase();
			if (str2.equals("END_OF_TEXT")) break;

			char ch2[] = str2.toCharArray();
			
			for(int i = 0; i < ch2.length; i++){
				for(int j = 0; j < ch.length; j++){
					if(ch.length > i + j){
						if(ch[j] != ch2[i + j]){
							break;
						}
					}
					if(j == ch.length - 1){
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}