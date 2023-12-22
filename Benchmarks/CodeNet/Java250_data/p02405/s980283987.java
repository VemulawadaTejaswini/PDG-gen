import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static final String BR = System.getProperty("line.separator");

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			StringBuilder s = new StringBuilder();
			String[] strArray;
			String line = br.readLine();

			while (line.equals("0 0") == false) {
				strArray = line.split("\\s");
				for (int i = 0; i < Integer.parseInt(strArray[0]); i++) {
					for (int j = 0; j < Integer.parseInt(strArray[1]); j++) {
						if (i % 2 == 0) {
							if (j % 2 == 0) {
								s.append("#");
							} else {
								s.append(".");
							}
						} else {
							if (j % 2 == 0) {
								s.append(".");
							} else {
								s.append("#");
							}
						}
					}
					s.append(BR);
				}
				System.out.println(s);
				s.delete(0, s.length());
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}