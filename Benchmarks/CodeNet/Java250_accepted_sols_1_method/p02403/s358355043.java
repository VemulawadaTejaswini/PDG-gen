import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		StringBuilder all = new StringBuilder();

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();

			if (H + W == 0)
				break;

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					output = output.append("#");
				}
				output = output.append("\n");
			}
			all = all.append(output + "\n");
			output.delete(0,output.length());
		}
		System.out.print(all);
		sc.close();
	}

}