import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		boolean first = true;
		int amount = 0;
		List<Integer> list = new ArrayList<Integer>();
		try {
			while ((buffer = reader.readLine())  != null) {
				if (first) {
					first = false;
					amount = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
					list = new ArrayList<Integer>();
				}
				else {
					first = true;
					for (int i = 0; i < amount; i++) {
						list.add(Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" "))));
						buffer = buffer.substring(buffer.indexOf(" ") + 1);
					}
					for (int i = 0; i < amount; i++) {
						if (i != 0) System.out.print(" ");
						System.out.print(list.get(amount - i - 1));
					}
					System.out.println();
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}