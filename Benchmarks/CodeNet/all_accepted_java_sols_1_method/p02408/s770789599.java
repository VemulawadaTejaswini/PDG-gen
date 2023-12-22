import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int amount = 0;
		int count = 0;
		List<Integer> S = new ArrayList<Integer>();
		List<Integer> H = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();
		List<Integer> D = new ArrayList<Integer>();
		try {
			while ((buffer = reader.readLine())  != null) {
				if (amount == 0) {
					amount = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				}
				else {
					String card = buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" "));
					buffer = buffer.substring(buffer.indexOf(" ") + 1);
					int number = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
					switch (card) {
					case ("S") : {
						S.add(number);
						break;
					}
					case ("H") : {
						H.add(number);
						break;
					}
					case ("C") : {
						C.add(number);
						break;
					}
					case ("D") : {
						D.add(number);
						break;
					}
					}
					if (++count == amount) {
						for (int s = 1; s <= 13; s++) {
							if (!S.contains(s)) {
								System.out.println("S " + s);
							}
						}
						for (int h = 1; h <= 13; h++) {
							if (!H.contains(h)) {
								System.out.println("H " + h);
							}
						}
						for (int c = 1; c <= 13; c++) {
							if (!C.contains(c)) {
								System.out.println("C " + c);
							}
						}
						for (int d = 1; d <= 13; d++) {
							if (!D.contains(d)) {
								System.out.println("D " + d);
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}