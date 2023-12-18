import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int i = 1;
			while (true) {
				String str = reader.readLine();
				String[] arr = str.split(" ");
				int x = Integer.parseInt(arr[0]);
				int y = Integer.parseInt(arr[1]);

				if (x == 0 && y == 0) {
					break;
				}
				
				if (x < y) {
					System.out.println(x + " " + y);
				} else {
					System.out.println(y + " " + x);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}