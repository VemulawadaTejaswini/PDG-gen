import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private class HashSet {

		private int M = 1046527;
		private String[] H = new String[M];
		
		private int getChar(char ch) {
			if (ch=='A') return 1;
			else if (ch=='C') return 2;
			else if (ch=='G') return 3;
			else if (ch=='T') return 4;
			else return 0;
		}
		
		private int getKey(String str) {
			int sum = 0, p = 1;
			for (int i = 0; i < str.length(); i++) {
				sum += p*(getChar(str.charAt(i)));
				p *= 4;
			}
			return sum;
		}

		private int h1(int key) {return key % M;}
		private int h2(int key) {return 1 + (key % (M-1));}

		public boolean find(String str) {
			int key, i, h;
			key = getKey(str);
			for (i = 0 ;; i++) {
				h = (h1(key) + i * h2(key)) % M;
				if (H[h] != null && H[h].equals(str)) return true;
				else if (H[h] == null || H[h].length() == 0) return false;
			}
		}
		
		public void insert(String str) {
			int key, i, h;
			key = getKey(str);
			for (i = 0 ;; i++) {
				h = (h1(key) + i * h2(key)) % M;
				if (H[h] != null && H[h].equals(str)) return;
				else if (H[h] == null || H[h].length() == 0) {
					H[h] = new String(str);
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashSet set = new HashSet();
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String cmd = st.nextToken();
			String str = st.nextToken();
			if (cmd.equals("insert")) {
				set.insert(str);
			} else if (cmd.equals("find")) {
				if (set.find(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		reader.close();
	}
}
