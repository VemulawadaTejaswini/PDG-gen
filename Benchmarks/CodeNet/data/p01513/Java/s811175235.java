import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}

			HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<Integer, ArrayList<Integer>>();

			for (int i = 0; i < N; i++) {
				int M = nextInt();
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int j = 0; j < M; j++) {
					list.add(nextInt());
				}
				hashMap.put(i, list);
			}

			ArrayList<Integer> lost = new ArrayList<Integer>();
			int K = nextInt();
			for (int i = 0; i < K; i++) {
				lost.add(nextInt());
			}

			int badman = -1;
			for (int i = 0; i < hashMap.size(); i++) {
				boolean find = true;

				for (int looser : lost) {
					if (hashMap.get(i).size() == 0) {
						find = false;
						break;
					}
					for (int j = 0; j < hashMap.get(i).size(); j++) {
						if (hashMap.get(i).get(j) == looser) {
							break;
						}
						if (j == hashMap.get(i).size() - 1) {
							find = false;
						}
					}
					if (!find) {
						break;
					}
				}

				if (find) {
					if (badman == -1) {
						badman = i + 1;
					} else {
						badman = -1;
						break;
					}
				}
			}

			System.out.println(badman);

		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}