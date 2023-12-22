import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			int h = Integer.parseInt(arr[0]);
			int w = Integer.parseInt(arr[1]);
			if (h == 0 && w == 0)
				break;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if ((i + j) % 2 == 0)
						System.out.print("#");
					else
						System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}