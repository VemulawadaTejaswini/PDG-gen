import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));

			String str = reader.readLine();
			int x = Integer.parseInt(str.split(" ",0)[0]);
			int y = Integer.parseInt(str.split(" ",0)[1]);
			
			System.out.println(x * y);
			
			reader.close();
	}
}