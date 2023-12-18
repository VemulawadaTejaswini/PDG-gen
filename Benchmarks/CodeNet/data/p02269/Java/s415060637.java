import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int A = 0;
	public static final int C = 1;
	public static final int G = 2;
	public static final int T = 3;

	public static class Dictionary {
		private Dictionary[] index;
		private boolean judge;

		public Dictionary() {
			this.index = new Dictionary[4];
			this.judge = false;
		}

		public void insert(String word) {
			int i;

			if(word.charAt(0) == 'A') {
				i = A;
			} else if(word.charAt(0) == 'C') {
				i = C;
			} else if(word.charAt(0) == 'G') {
				i = G;
			} else {
				i = T;
			}

			if(this.index[i] == null) {
				this.index[i] = new Dictionary();
			}

			if(word.length() == 1) {
				this.index[i].judge = true;
				return;
			}

			this.index[i].insert(word.substring(1));
		}

		public boolean find(String word) {
			int i;

			if(word.charAt(0) == 'A') {
				i = A;
			} else if(word.charAt(0) == 'C') {
				i = C;
			} else if(word.charAt(0) == 'G') {
				i = G;
			} else {
				i = T;
			}

			if(this.index[i] == null) {
				return false;
			}

			if(word.length() == 1) {
				return this.index[i].judge;
			}

			return this.index[i].find(word.substring(1));
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int orderNum = Integer.parseInt(br.readLine());

		Dictionary dictionary = new Dictionary();

		for(int i = 0; i < orderNum; i++) {
			String[] order = br.readLine().split(" ");

			if(order[0].equals("insert")) {
				dictionary.insert(order[1]);
			}

			if(order[0].equals("find")) {
				dictionary.find(order[1]);

				if(dictionary.find(order[1])) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}