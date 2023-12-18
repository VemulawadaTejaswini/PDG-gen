import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] amnt = new int[26];
		char[] sentence;
		
		do {
			sentence = br.readLine().toLowerCase().toCharArray();
			
			if (sentence.length != 0) {
				for (char s : sentence) {
					for (char c = 'a', i = 0; c <= 'z'; c++, i++) {
						if (s == c) amnt[i]++;
					}
				}
			} else {
				break;
			}
		} while (true);
		
		for (char c = 'a', i = 0; c <= 'z'; c++, i++) {
			System.out.println(c + " : " + amnt[i]);
		}
	}
}