import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	int[] A;
	List<int[]> pairs;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
	}

	void calc() {
		int min = A[0];
		int max = -1;
		pairs = new ArrayList<>();

		for (int i = 1; i < N; ++i) {
			if (min >= max) {
				// 底値更新 or 売値を探している
				if (min > A[i]) {
					min = A[i];
				}
				if (max < A[i]) {
					if (A[i] > min) {
						max = A[i];
					}
				}
			} else {
				// 売りタイミングを探している
				if (A[i] < max) {
					// これまで見つけたタイミングで売るのがよかった
					int[] array = new int[2];
					array[0] = min;
					array[1] = max;
					pairs.add(array);
					min = A[i];
					max = -1;
				} else {
					// 売値更新
					max = A[i];
				}
			}
		}
		if (min < max) {
			int[] array = new int[2];
			array[0] = min;
			array[1] = max;
			pairs.add(array);
		}

	}

	void showResult() {
		int result = 1000;
		for (int i = 0; i < pairs.size(); ++i) {
			int min = pairs.get(i)[0];
			int max = pairs.get(i)[1];
			System.out.println(min + " " + max);
			int stockNum = result / min;
			result %= min;
			result += stockNum * max;
		}
		System.out.println(result);
	}
}