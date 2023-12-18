
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int[] alphaCnt = new int[26];
			String str;
			char[] cArr;

			while ((str = br.readLine()) != null) {
				cArr = str.toCharArray();
				for (char c : cArr) {
					if ('A' <= c && c <= 'Z') {
						alphaCnt[c - 'A']++;
					} else if ('a' <= c && c <= 'b') {
						alphaCnt[c - 'a']++;
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < alphaCnt.length; i++) {
				System.out.println((char) (i + 65) + " : " + alphaCnt[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ioe) {
			}

		}
	}
}