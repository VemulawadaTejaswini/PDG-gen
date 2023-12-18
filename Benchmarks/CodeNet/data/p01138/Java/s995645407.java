import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int N = scanner.nextInt();// 本数
			if (N == 0) {
				break;
			}

			ArrayList<Train> list = new ArrayList<Train>();
			for (int i = 0; i < N; i++) {
				String[] sf = new String[2];
				sf[0] = scanner.next();
				sf[1] = scanner.next();

				int[][] times = new int[2][3];
				for (int j = 0; j < times.length; j++) {
					String[] tmp = sf[j].split(":");
					for (int k = 0; k < times[j].length; k++) {
						times[j][k] = Integer.parseInt(tmp[k]);
					}
				}
				int start = times[0][0] * 3600 + times[0][1] * 60 + times[0][2];
				int finis = times[1][0] * 3600 + times[1][1] * 60 + times[1][2];
				list.add(new Train(start, 0));
				list.add(new Train(finis, 1));
			}

			Collections.sort(list);
			int max = 0;
			int trains = 0;
			for (Train train : list) {
				if (train.type == 0) {
					trains++;
				} else {
					trains--;
				}
				max = Math.max(max, trains);
			}

			System.out.println(max);
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

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}

class Train implements Comparable<Train> {
	int time, type;// 出発0、帰還1とする

	Train(int time, int type) {
		this.time = time;
		this.type = type;
	}

	@Override
	public int compareTo(Train arg0) {
		if (this.time == arg0.time) {
			return arg0.type - this.type;
		}
		return this.time - arg0.time;// 昇順
	}
}