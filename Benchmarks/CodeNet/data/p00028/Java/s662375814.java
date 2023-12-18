import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
	private	static	BufferedReader	br   = null;
	private	static	int[][]			freq = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
		freq = new int[100][2];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strIn = null;

		for (int n = 0; n < 100; n++) {
			freq[n][0] = n + 1;
		}

		while((strIn = parseStdin()) != null) {
			freq[Integer.parseInt(strIn) - 1][1]++;
		}

		Arrays.sort(freq, new TheComparator());

		for (int n = 0; n < 100; n++) {
			if (n > 0 && freq[n-1][1] != freq[n][1]) {
				break;
			}
			System.out.println(freq[n][0]);
		}
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}

class TheComparator implements Comparator<int[]> {

    /** ソート対象のカラムの位置 */
    public int compare( int[] freq1, int[] freq2 ) {
        return (freq1[1] != freq2[1]) ? freq2[1] - freq1[1] : freq1[0] - freq2[0];
    }
}