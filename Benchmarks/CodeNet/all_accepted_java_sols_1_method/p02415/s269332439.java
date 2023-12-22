import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		char[] c = new char[1200];
		
		String line = br.readLine();
		for(int i = 0; i < line.length(); i++){
			c[i] = line.charAt(i);
			if(Character.isUpperCase(c[i])){
				c[i] = Character.toLowerCase(c[i]);
			}else{
				c[i] = Character.toUpperCase(c[i]);
			}
		}
		
		for(int j = 0; j < line.length(); j++){
			System.out.print(c[j]);
			if(j == line.length() - 1){
				System.out.println();
			}
		}
	}
}