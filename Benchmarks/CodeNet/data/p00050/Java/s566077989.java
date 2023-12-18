import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));

			String str = reader.readLine();
			
			str = str.replaceAll("apple", "appleT");
			str = str.replaceAll("peach", "apple");
			str = str.replaceAll("appleT", "apple");
			
			System.out.println(str);
		
			reader.close();
	}
}