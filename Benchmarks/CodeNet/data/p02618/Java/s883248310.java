import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int D;
	int[] c;
	int[][] s;

	Main(BufferedReader in) throws IOException {
		D = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		c = new int[tokens.length];
		for (int i = 0; i < tokens.length; ++i) {
			c[i] = Integer.parseInt(tokens[i]);
		}
		s = new int[D][c.length];
		for (int i = 0; i < D; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < tokens.length; ++j) {
				s[i][j] = Integer.parseInt(tokens[j]);
			}
		}

	}

	int sub(int[] array) {
		int result = -1;
		int max = -1;
		for (int i = 0; i < array.length; ++i) {
			if (max < array[i]) {
				result = i;
				max = array[i];
			}
		}
		return result;
	}

	void calc() {
		// まずは最大のSを選ぶことにする
		for (int i = 0; i < D; ++i) {
			int r = sub(s[i]);
			System.out.println((r + 1));
		}
	}

	void showResult() {
	}
}
