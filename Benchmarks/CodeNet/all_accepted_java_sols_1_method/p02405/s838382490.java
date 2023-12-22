import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int height = 0;
	static int weight = 0;

	public static void main(String[] args) throws Exception {
		boolean zeroFlag = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		while (zeroFlag) {
			String[] nyuryokuStr = line.split("[\\s]+");
			height = Integer.parseInt(nyuryokuStr[0]);
			weight = Integer.parseInt(nyuryokuStr[1]);
			if (height == 0 && weight == 0) {
				zeroFlag = false;
			} else {
				for (int h = 0; h < height; h++) {
					for (int w = 0; w < weight; w++) {
						if (((w % 2 == 0) && (h % 2 == 0))
								|| ((w % 2 == 1) && (h % 2 == 1))) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
					System.out.println();
				}
				System.out.println();
				line = br.readLine();
			}
		}
	}
}