import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while (true) {
				//StringTokenizer st = new StringTokenizer(br.readLine());
				String[] readLine = br.readLine().split(" ");
				
				int a = Integer.parseInt(readLine[0]);
				String op = readLine[1];			
				int b = Integer.parseInt(readLine[2]);
				
				if (op.equals("?")) {
					break;
				}
				
				int ans = 0;
				switch (op) {
				case "+":
					ans = a + b;
					break;
				case "-":
					ans = a - b;
					break;
				case "*":
					ans = a * b;
					break;
				case "/":
					ans = a / b;
					break;
				}
					System.out.println(ans);						
			}
	}
}
