import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int count = 0;
		int amount = 0;
		List<Integer> list = new ArrayList<Integer>();
		try {
			while ((buffer = reader.readLine())  != null) {
				if (count == 0) {
					count++;
					amount = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				}
				else {
					for (int i = 0; i < amount; i++) {
						if (i != 0) {
							buffer = buffer.substring(buffer.indexOf(" ") + 1);
						}
						int a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
						list.add(a);
					}
					int min = Integer.MAX_VALUE;
					int max = Integer.MIN_VALUE;
					long sum = 0;
					for (int i : list) {
						if (min > i) min = i;
					}
					for (int i : list) {
						if (max < i) max = i;
					}
					for (int i : list) {
						sum += i;
					}
					System.out.println(min + " " + max + " " + sum);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}