import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] chara = str.split("", 0);
		int length = chara.length;
		for (int i = 0; i <= length / 2; i++) {
			int j = length - i - 1;
			if (i >= j) {
				break;
			}
			String temporary = chara[i];
			chara[i] = chara[j];
			chara[j] = temporary;
		}
		for (String charac : chara) {
			System.out.print(charac);
		}
		System.out.println();
	}
}