import java.io.*;

class Main {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));// ??\????????????????????????
			String line;

			// ????????????????????´?????????
			// String line; // ??\???????????????????????\???
			// while ((line = br.readLine()) != null) {
			// processLine(line);
			// }

			while ((line = br.readLine()) != null) {
				int first = Integer.valueOf(line.substring(0, 1));
				int second = Integer.valueOf(line.substring(2, 3));
				String printed = "";
				
				if(first == 0 && second == 0)
				{
					break;
				}
				
				if (first < second) {
					printed = first + " " + second;
				} else {
					printed = second + " " + first;
				}
				System.out.println(printed);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// private static void processLine(String line) {
	// System.out.println(line);
	// }
}