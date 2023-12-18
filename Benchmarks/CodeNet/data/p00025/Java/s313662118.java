import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] numbers1str = str.split(" ", 4);
			str = br.readLine();
			String[] numbers2str = str.split(" ", 4);
			int[] numbers1 = new int[4];
			int[] numbers2 = new int[4];
			int blow = 0;
			int hit = 0;
			for (int i = 0; i < 4; i++) {
				numbers1[i] = Integer.parseInt(numbers1str[i]);
				numbers2[i] = Integer.parseInt(numbers2str[i]);
			}
			for (int i = 0; i < 4; i++) {
				if (numbers1[i] == numbers2[i]) {
					hit++;
					continue;
				}
				for (int j = 0; j < 4; j++) {
					if (numbers1[i] == numbers2[j]) {
						blow++;
						break;
					}
				}
			}
			System.out.println(hit + " " +blow);
			str = br.readLine();
		}
	}
}