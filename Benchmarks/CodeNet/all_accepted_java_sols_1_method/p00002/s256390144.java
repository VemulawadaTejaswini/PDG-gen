
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String s;
		while(( s = reader.readLine())!=null){
			String[] line = s.split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			builder.append(String.valueOf(a+b).length()).append('\n');
			
		}
		System.out.print(builder);
		
	}
}