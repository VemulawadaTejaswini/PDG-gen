import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string = "";
		
		while((string = reader.readLine()) != null){
		char str[] = string.toCharArray();
		int[] n = new int[10];
		for(int i = 0; i < 10; i++) n[i] = str[i] - '0';
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10 - 1 - i; j++){
			   string = String.valueOf(n[j] + n[j + 1]);
				n[j] = Integer.parseInt(
						String.valueOf(
						string.charAt(
						string.length() - 1)));
			}
		}
		System.out.println(n[0]);
		}
		reader.close();
	}
}