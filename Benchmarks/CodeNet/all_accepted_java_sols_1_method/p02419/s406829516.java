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
		
		while(true){
			str2 = br.readLine();	
			if (str2.equals("END_OF_TEXT")) break;
			
			str2 = str2.toLowerCase();
			String st[] = str2.split(" ", 0);
			for(int i = 0; i < st.length; i++){
				if(st[i].equals(str)){
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}