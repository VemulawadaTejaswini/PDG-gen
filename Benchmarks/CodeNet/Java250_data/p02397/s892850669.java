import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String str = "";
		try {
			while ((str = in.readLine()) != null) {
				if (str.equals("0 0")) break;
				String[] ab = str.split(" ");
				
				int[] numbers = new int[2];
				numbers[0] = Integer.parseInt(ab[0]);
				numbers[1] = Integer.parseInt(ab[1]);
				
				Arrays.sort(numbers);
				System.out.println(numbers[0] + " " + numbers[1]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}