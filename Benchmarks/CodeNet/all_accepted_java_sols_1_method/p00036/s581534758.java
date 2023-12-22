import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		do {
			List<String> list = new ArrayList<String>();
			for (int i = 0 ; i < 8 ; i++) {
				line = br.readLine();
				if (!line.equals("00000000")) list.add(line);
			}
			if (list.size() == 1) System.out.println("C");
			else if (list.size() == 4) System.out.println("B");
			else if (list.size() == 2) {
				int j1 = list.get(0).indexOf('1');
				int j2 = list.get(1).indexOf('1');
				if (j1 < j2) System.out.println("E");
				else if (j1 == j2) System.out.println("A");
				else System.out.println("G");
			} else {
				int j1 = list.get(0).indexOf('1');
				int j3 = list.get(2).indexOf('1');
				if (j1 < j3) System.out.println("F");
				else System.out.println("D");
			}
		} while ((line = br.readLine()) != null);

	}
}