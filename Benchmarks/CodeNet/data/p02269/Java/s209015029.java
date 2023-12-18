import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

//		StringBuilder sb = new StringBuilder();

		for (int i=0; i < n; i++) {
			String[] inst = br.readLine().split(" ");

			if (inst[0].equals("insert")) {
				insert(inst[1]);
			} else {
				if (find(inst[1])) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}

	static int[] pow4; // pow4[i]:4^i

	static int M; // A, C, G, T, ???????????§????????\??????????????\????????????????????????????????°

	static String[] H; // hash table

	static {
		pow4 = new int[13];
		for (int i=0; i < 13; i++) {
			pow4[i] = (int)Math.pow(4, i);
			M += pow4[i];
		}

		H = new String[M];
	}

	static int getChar(char ch) {
		switch (ch) {
		case 'A':
			return 0;
		case 'C':
			return 1;
		case 'G':
			return 2;
		case 'T':
			return 3;
		default :
			return -1;
		}
	}

	static int getKey(String str) {
		int key = 0;
		char[] chaa = str.toCharArray();

		for (int i=0; i < chaa.length; i++) {
			key += pow4[i];
		}

		for (int i=0; i < chaa.length; i++) {
			key += pow4[i] * getChar( chaa[i] );
		}

		return key;
	}

	static boolean find(String str) {
		int key = getKey(str);

		if (H[key] != null) return true;
		else return false;
	}

	static void insert(String str) {
		int key = getKey(str);
		H[key] = str;
	}
}