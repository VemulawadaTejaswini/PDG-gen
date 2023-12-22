import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			String[] splitInput = input.split(" ");

			int a = Integer.parseInt(splitInput[0]);
			int b = Integer.parseInt(splitInput[1]);
			int c = Integer.parseInt(splitInput[2]);
			
			if (
					!(
					       (a >= 0 && a <= 100)
					    && (b >= 0 && b <= 100)
					    && (c >= 0 && c <= 100)
				     )
				) {
				throw new IllegalArgumentException();
			}
			
			String ans;
			if ((a < b) && (b < c)) {
				ans = "Yes";
			} else {
				ans = "No";
			}
			
			System.out.println(ans);
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}