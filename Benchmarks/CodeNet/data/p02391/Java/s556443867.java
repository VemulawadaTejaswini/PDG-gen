import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			String[] splitInput = input.split(" ", 0);

			int a = Integer.parseInt(splitInput[0]);
			int b = Integer.parseInt(splitInput[1]);
			
			if (!((a >= -1000 && a <= 1000) && (b >= -1000 && b <= 1000))) {
				throw new IllegalArgumentException();
			}
			
			String sign;
			if (a > b) {
				sign = " > ";
			} else if (a < b) {
				sign = " < ";
			} else {
				sign = " == ";
			}
			
			System.out.println("a" + sign + "b");
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}