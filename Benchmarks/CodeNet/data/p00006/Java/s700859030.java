import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		char[] charArray = line.toCharArray();
		for(int i = 0;i < charArray.length;i++){
			System.out.print(charArray[charArray.length - (i + 1)]);
		}
	}
}