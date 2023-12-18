import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean isEnd = str == null;
		while (!isEnd) {
			long number = Long.parseLong(str);
			long[] list = new long[(int) number];
			list[0] = 2;
			int count = 1;
			if (number == 1) {
				System.out.println("0");
				str = br.readLine();
				isEnd = str == null;
				continue;
			} else if (number == 2) {
				System.out.println("1");
				str = br.readLine();
				isEnd = str == null;
				continue;
			} else {
				for (int i = 3; i <= number; i = i + 2) {
					for (int j = 0; true; j++) {
						;
						if (i % list[j] == 0) {
							break;
						} else if (list[j] >= Math.pow(i, 0.5)) {
							list[count] = (long) i;
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