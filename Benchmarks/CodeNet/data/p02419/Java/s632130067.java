import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
					
		String str, str2;
		
		str = br.readLine();
		str = str.toLowerCase();

		int sum = 0;
		
		char ch[] = str.toCharArray();
		
		while(true){
			str2 = br.readLine();
			
			if (str2.equals("END_OF_TEXT")) break;
			
			str2 = str2.toLowerCase();

			char ch2[] = str2.toCharArray();
			
			for(int i = 0; i <= ch2.length - ch.length; i++){
				for(int j = 0; j < ch.length; j++){
					if(ch[j] != ch2[i + j]){
						break;
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