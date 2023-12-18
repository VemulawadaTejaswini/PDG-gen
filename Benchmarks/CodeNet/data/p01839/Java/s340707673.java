import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int count = Integer.parseInt(br.readLine());
			String aun[] = new String[count];
			for (int i = 0; i < count; i++) {
				aun[i] = br.readLine();
			}
			if (!aun[0].equals("A"))
				System.out.println("NO");
			int aCount = 0;
			int unCount = 0;
			boolean aStart = true;
			boolean no = false;
			for (int i = 0; i < count; i++) {
				if (aun[i].equals("A") && aStart) {
					aCount++;
					aStart = false;
				} else if (aun[i].equals("A")) {
					if (aCount < unCount) {
						no = true;
						break;
					}
					aCount++;
				} else if (aun[i].equals("Un")) {
					unCount++;
				}
			}
			if (no) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
