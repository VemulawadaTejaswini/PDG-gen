import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer nInteger = Integer.parseInt(bufferedReader.readLine());
		String string =bufferedReader.readLine();
		String []str = string.split(" ");
		
		for(int i = str.length-1; i >= 0; i--){
			if (i != 0) {
				System.out.print(str[i] + " ");
			}else{
				System.out.print(str[i]);
			}
		}System.out.println();
	}
}