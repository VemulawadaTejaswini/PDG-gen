import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int amount = 0;
		int count = 0;
		byte[][][] buildings = new byte[4][3][10];
		try {
			while ((buffer = reader.readLine())  != null) {
				String[] strings = buffer.split(" ");
				if (amount == 0) {
					amount = Integer.valueOf(strings[0]);
				}
				else {
					int b = Integer.valueOf(strings[0]);
					int f = Integer.valueOf(strings[1]);
					int r = Integer.valueOf(strings[2]);
					int v = Integer.valueOf(strings[3]);
					buildings[b - 1][f - 1][r - 1] += v;
					if (++count >= amount) {
						for (byte building = 0; building < 4; building++) {
							for (byte floor = 0; floor < 3; floor++) {
								for (byte room = 0; room < 10; room++) {
									System.out.print(" " + buildings[building][floor][room]);
								}
								System.out.println();
							}
							if (building < 3) {
								System.out.println("####################");
							}
						}
						return;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

