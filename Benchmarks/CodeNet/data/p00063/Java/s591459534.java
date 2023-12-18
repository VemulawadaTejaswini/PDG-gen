import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int c = 0;
		while ((line = bf.readLine()) != null) {
			if(new StringBuffer(line).reverse().toString().equals(line))
				c++;
		}
		System.out.println(c);
	}
}