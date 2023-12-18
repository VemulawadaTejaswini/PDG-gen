import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String[] words = br.readLine().split(" ");

		int maxlen = 0;
		int maxfreq = 1;
		String lenans = "";
		String freqans = "";
		HashMap<String, Integer> frequency = new HashMap<>();
		for (int i=0; i < words.length; i++) {
			if (words[i].length() > maxlen) {
				maxlen = words[i].length();
				lenans = words[i];
			}

			Integer n;
//			if ( frequency.containsKey(words[i]) ){
//				int n = frequency.get(words[i]);
//				frequency.replace(words[i], n+1);
//			}
			if (  ( n = frequency.get(words[i]) ) == null  ) {
				frequency.put(words[i], 1);
			} else {
				n++;
				frequency.replace(words[i], n);
				if (n > maxfreq) {
					maxfreq = n;
					freqans = words[i];
				}
			}
		}

		System.out.println(freqans + " " + lenans);
	}

}