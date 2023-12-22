import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			String[] arr = str.split(" ");
			int W = Integer.parseInt(arr[0]);
			int H = Integer.parseInt(arr[1]);
			int x = Integer.parseInt(arr[2]);
			int y = Integer.parseInt(arr[3]);
			int r = Integer.parseInt(arr[4]);

			if (x - r >= 0 && y - r >= 0 && x + r <= W && y + r <= H) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}