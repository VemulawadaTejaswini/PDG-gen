
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			// A(65) Z(90)
			int[] alphaCnt = new int[26];
			String str;

			while ((str = br.readLine()) != null) {
				for (char c : str.toCharArray()) {
					if ('A' <= c && c <= 'Z') {
						alphaCnt[c - 'A']++;
					} else if ('a' <= c && c <= 'b') {
						alphaCnt[c - 'a']++;
					}
				}
			}

			for (int i = 0; i < alphaCnt.length; i++) {
				System.out.println((char) (i + 'a') + " : " + alphaCnt[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}