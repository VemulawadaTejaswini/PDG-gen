import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] numbers1 = str.split(" ", 4);
			str = br.readLine();
			String[] numbers2 = str.split(" ", 4);
			int blow = 0;
			int hit = 0;
			for (int i = 0; i < 4; i++) {
				if (numbers1[i].equals(numbers2[i])) {
					hit++;
					continue;
				}
				for (int j = 0; j < 4; j++) {
					if (numbers1[i].equals(numbers2[j])) {
						blow++;
						break;
					}
				}
			}
			System.out.println(hit + " " + blow);
			str = br.readLine();
		}
	}
}