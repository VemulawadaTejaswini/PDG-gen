import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int H = 0;
		int W = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();
			String[] num = str.split(" ");

			H = Integer.parseInt(num[0]);
			W = Integer.parseInt(num[1]);

			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {

				for (int j = 0; j < W; j++) {
					System.out.print("#");
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}