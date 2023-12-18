import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int n = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= n; i++){
			String string = String.valueOf(i);
			boolean bool = true;
			for(int j = 0; j < string.length(); j++){
				if(string.charAt(j) == '3'){
					System.out.print(" " + i);
					bool = false;
				}
			}
			if(i % 3 == 0 && bool){
				System.out.print(" " + i);
			}
		}
		System.out.print("\n");
		reader.close();
	}
}