import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader(System.in);

		while (true) {
			int a =in.readInt();
			String op =in.read();
			if (op.equals("?")) break;
			int b =in.readInt();
			
			int ans = 0;
			switch (op) {
			case "+":
				ans = a + b ;
				break;
			case "-":
				ans = a - b ;
				break;		
			case "*":
				ans = a * b ;
				break;	
			case "/":
				ans = a / b ;
				break;	
			}
			System.out.println(ans);
		}
	}	
}

class InputReader{
	private BufferedReader br;
	private StringTokenizer buffer;
	
	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
	}
	
	public String read() throws IOException {
		while (buffer == null || !buffer.hasMoreTokens()) {
			buffer = new StringTokenizer(br.readLine());
		}
		return buffer.nextToken();
	}
	
	public int readInt() throws IOException {
		while (buffer == null || !buffer.hasMoreTokens()) {
			buffer = new StringTokenizer(br.readLine());
		}
		return Integer.parseInt(buffer.nextToken());
	}
	
	public double readDouble() throws IOException {
		while (buffer == null || !buffer.hasMoreTokens()) {
			buffer = new StringTokenizer(br.readLine());
		}
		return Double.parseDouble(buffer.nextToken());
	}	
}
