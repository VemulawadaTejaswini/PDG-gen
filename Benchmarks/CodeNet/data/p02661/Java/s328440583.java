import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long[] A, B;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new long[N];
		B = new long[N];
		for (int i = 0; i < N; ++i) {
			String[] t = in.readLine().split(" ");
			A[i] = Long.parseLong(t[0]);
			B[i] = Long.parseLong(t[1]);
		}
		Arrays.sort(A);
		Arrays.sort(B);
	}

	void calc() {
		if (N % 2 == 0) {
			long aSmallMiddle = A[N / 2 - 1];
			long aLargeMiddle = A[N / 2];
			long bSmallMiddle = B[N / 2 - 1];
			long bLargeMiddle = B[N / 2];
			long result = (bSmallMiddle - aLargeMiddle) * 2 + 1;
			if (aSmallMiddle != aLargeMiddle) {
				result += 1;
			}
			if (bSmallMiddle != bLargeMiddle) {
				result += 1;
			}
			System.out.println(result);
		} else {
			long aMiddle = A[N / 2];
			long bMiddle = B[N / 2];
			long result = bMiddle - aMiddle + 1;
			System.out.println(result);
		}
	}

	void showResult() {
	}
}