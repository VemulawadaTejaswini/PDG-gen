import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String input;
			for (;;) {
				input = reader.readLine();
				if (input.equals("0")) break;
				char ch;
				int sum = 0;
				for (int i = 0; i < input.length(); i++) {
					ch = input.charAt(i);
					sum += Character.getNumericValue(ch);
				}
				System.out.println(sum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}