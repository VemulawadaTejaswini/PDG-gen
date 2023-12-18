import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String input = r.readLine();
		while(input != null){
			String s[] = input.split(" ");
			int a = Integer.parseInt(s[0]) * Integer.parseInt(s[3]);
			int b = Integer.parseInt(s[1]) * Integer.parseInt(s[3]);
			int c = Integer.parseInt(s[2]) * Integer.parseInt(s[3]);
			int d = Integer.parseInt(s[3]) * Integer.parseInt(s[0]);
			int e = Integer.parseInt(s[4]) * Integer.parseInt(s[0]);
			int f = Integer.parseInt(s[5]) * Integer.parseInt(s[0]);
			
			float y = (c-f)/(b-e);
			float x = (c-b*y)/a;
			System.out.println(String.format("%.3f %.3f", x, y));
			
			input = r.readLine();
		}
	}
}