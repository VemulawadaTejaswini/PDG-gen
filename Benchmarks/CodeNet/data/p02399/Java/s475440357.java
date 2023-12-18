import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String str = reader.readLine();
			String[] arr = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int d = a / b;
			int r = a % b;
			String f = String.format("%.5f", 1.0 * a / b);
			System.out.println(d + " " + r + " " + f);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}