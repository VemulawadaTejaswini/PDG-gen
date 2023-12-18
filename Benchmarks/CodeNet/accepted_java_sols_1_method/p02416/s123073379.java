import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		while(true){
			
			String str = br.readLine();
			
			if(str.equals("0"))break;
			
			char ch[] = str.toCharArray();
			
			int sum = 0;
			for(int i = 0; i < ch.length; i++){
				sum += Character.getNumericValue(ch[i]); 
			}	
			System.out.println(sum);
		}
	}
}