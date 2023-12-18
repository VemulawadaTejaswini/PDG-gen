import java.util.*;
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

	int N;
	int[] A, B;
	Map<Integer, Integer> aCount, bCount;
	boolean enable = true;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new int[N];
		B = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			B[i] = Integer.parseInt(tokens[i]);
		}
		aCount = new HashMap<>();
		bCount = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (aCount.containsKey(A[i])) {
				aCount.put(A[i], aCount.get(A[i]) + 1);
			} else {
				aCount.put(A[i], 1);
			}
		}
		for (int i = 0; i < N; ++i) {
			int key = B[i];
			if (bCount.containsKey(key)) {
				bCount.put(key, bCount.get(key) + 1);
			} else {
				bCount.put(key, 1);
			}
		}
	}

	boolean isEnable() {
		int threshold = N / 2 + 1;
		for (Integer key : aCount.keySet()) {
			if (bCount.containsKey(key)) {
				if (aCount.get(key) >= threshold && bCount.get(key) >= threshold) {
					return false;
				}
			}
		}
		return true;
	}

	void calc() {
		if (!isEnable()) {
			enable = false;
			return;
		}
	}

	int getShiftNum() {
		// 先頭から見て行って，要素ごとにかぶる最大の数を出す
		Map<Integer, Integer> overrap = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (A[i] == B[i]) {
				int val = A[i];
				if (overrap.containsKey(val)) {
					overrap.put(val, overrap.get(val) + 1);
				} else {
					overrap.put(val, 1);
				}
			}
		}
		// 最大値を返す
		int max = -1;
		for (Integer key : overrap.keySet()) {
			max = Math.max(max, overrap.get(key));
		}
		return max;
	}

	int[] getShiftArray(int shiftNum) {
		int[] result = new int[N];
		for (int i = 0; i < N; ++i) {
			int index = (i + shiftNum + N) % N;
			result[i] = B[index];
		}
		return result;
	}

	boolean isOK(int[] shiftArray) {
		for (int i = 0; i < N; ++i) {
			if (A[i] == shiftArray[i]) {
				return false;
			}
		}
		return true;
	}

	void showResult() {
		if (enable) {
			System.out.println("Yes");
			if (N >= 2) {
				int shiftNum = getShiftNum();
				int[] shiftArray = getShiftArray(shiftNum);
				if (!isOK(shiftArray)) {
					shiftArray = getShiftArray(-1 * shiftNum);
				}
				System.out.print(shiftArray[0]);
				for (int i = 1; i < N; ++i) {
					System.out.print(" " + shiftArray[i]);
				}
				System.out.println("");
			} else {
				System.out.println(B[0]);
			}
		} else {
			System.out.println("No");
		}
	}
}