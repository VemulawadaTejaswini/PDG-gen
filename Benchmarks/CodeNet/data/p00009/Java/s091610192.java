import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean isEnd = str == null;
		while (!isEnd) {
			long number = Long.parseLong(str);
			List<Long> list = new ArrayList<Long>();
			list.add((long) 2);
			int count = 1;
			if (number == 1) {
				System.out.println("0");
				str = br.readLine();
				isEnd = str == null;
				continue;
			} else if (number == 2) {
				System.out.println(count);
				str = br.readLine();
				isEnd = str == null;
				continue;
			} else {
				for (int i = 3; i <= number; i = i + 2) {
					int length = list.size();
					for (int j = 0; j <= length; j++) {
						long prime = list.get(j);
						if (i % prime == 0) {
							break;
						}
						if ((double) prime >= Math.pow(i, 0.5)) {
							list.add((long) i);
							count++;
							break;
						}
					}
				}
				System.out.println(count);
				str = br.readLine();
				isEnd = str == null;
			}
		}
	}
}