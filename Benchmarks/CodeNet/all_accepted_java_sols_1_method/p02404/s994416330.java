import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] inputNum = br.readLine().split(" ");
			int H = Integer.parseInt(inputNum[0]);
			int W = Integer.parseInt(inputNum[1]);

			if (H == 0 && W == 0) {
				break;
			}

			for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= W; j++) {
					if (i == 1 || i == H || j == 1 || j == W) {
						System.out.print("#");
					}else {
						System.out.print(".");
					}
				}
				System.out.println("");

			}
			System.out.println("");

		}

	}

}