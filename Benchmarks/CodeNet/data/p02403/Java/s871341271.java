import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] str = in.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			if (H == 0 && W == 0)
				break;
			for (int i = 0; i < H; i += 1) {
				for (int j = 0; j < W; j += 1) {
					System.out.print("#");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}