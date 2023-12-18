import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		int[][][] rooms = new int[4][3][10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			int b = Integer.parseInt(arr[0]) - 1;
			int f = Integer.parseInt(arr[1]) - 1;
			int r = Integer.parseInt(arr[2]) - 1;
			int v = Integer.parseInt(arr[3]);

			rooms[b][f][r] += v;
		}

		for (int b = 0; b < 4; b++) {
			for (int f = 0; f < 3; f++) {
				for (int r = 0; r < 10; r++) {
					if (r != 0)
						System.out.print(" ");
					System.out.print(rooms[b][f][r]);
				}
				System.out.println();
			}
			if (b != 3)
				System.out.println("####################");
			else
				System.out.println();
		}
	}
}