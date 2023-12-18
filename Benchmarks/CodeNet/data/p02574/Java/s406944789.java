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
	int[] A;
	Set<Integer>[] sets;
	int[] filter;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		A = Arrays.stream(A).filter(x->x>1).toArray();
		N = A.length;
		Arrays.sort(A);
		filter = new int[A[N - 1] + 1];
		Arrays.fill(filter, -1);
		filter[1] = 1;
		for (int step = 2; step <= A[N - 1]; ++step) {
			for (int i = step; i <= A[N - 1]; i += step) {
				if (filter[i] < 0) {
					filter[i] = step;
				}
			}
		}
		sets = new Set[N];
		for (int i = 0; i < N; ++i) {
			sets[i] = getYakusuu(A[i]);
		}
	}

	void show() {
		for (int i = 0; i < N; ++i) {
			System.out.print(i + ": ");
			for (Integer val : sets[i]) {
				System.out.print(val + " ");
			}
			System.out.println("");
		}
	}

	Set<Integer> getYakusuu(int val) {
		Set<Integer> result = new HashSet<>();
		while (filter[val] != val) {
			result.add(filter[val]);
			val = val / filter[val];
		}
		result.add(val);
		return result;
	}

	int gcd(int large, int small) {
		if (large < small) {
			return gcd(small, large);
		}
		if (large % small == 0) {
			return small;
		} else {
			return gcd(small, large % small);
		}
	}

	boolean isSetwise() {
		int gcd = gcd(A[0], A[1]);
		for (int i = 2; i < N; ++i) {
			gcd = gcd(gcd, A[i]);
		}
		if (gcd == 1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isPairwise() {
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			count += sets[i].size();
			list.addAll(sets[i]);
		}
		if ((long) count == list.stream().distinct().count()) {
			return true;
		} else {
			return false;
		}
	}

	void calc() {
		if (isSetwise()) {
			if (isPairwise()) {
				System.out.println("pairwise coprime");
			} else {
				System.out.println("setwise coprime");
			}
		} else {
			System.out.println("not coprime");
		}
	}

	void showResult() {
		// show();
	}
}