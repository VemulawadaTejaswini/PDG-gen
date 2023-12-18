import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	enum STATE {
		BUY(1), SELL(2);
		int state = 0;

		private STATE(int state) {
			this.state = state;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str);
		str = reader.readLine();
		int[] A = new int[N];
		String[] words = str.split("\\s+");
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(words[i]);
		}
		STATE state = STATE.BUY;
		int num = 0;
		int total = 1000;
		for (int i = 1; i < N; i++) {
			boolean greater = A[i] - A[i - 1] >= 0 ? true : false;

			if (state.equals(STATE.BUY) && greater) {
				int value = A[i - 1];
				num = total / value;
				total = total % value;

				state = STATE.SELL;
			}

			if (state.equals(STATE.SELL) && !greater) {
				int value = A[i - 1];
				total = total + num * value;
				num = 0;

				state = STATE.BUY;
			}
		}

		if (state.equals(STATE.SELL)) {
			int value = A[N-1];
			total = total  + num*value;
			num = 0;
		}
		System.out.println(total);

		reader.close();
	}
}