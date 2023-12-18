import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] v = new int[N];
		for (int i = 0; i < N; ++i) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		ArrayList<Integer> vs = new ArrayList<Integer>();
		for (int i = 0; i < Math.min(4, N); ++i) {
			for (int j = 0; j < Math.min(4, N); ++j) {
				if (i == j) continue;
				vs.add(connect(v[i], v[j]));
			}
		}
		Collections.sort(vs);
		System.out.println(vs.get(2));
	}

	static int connect(int a, int b) {
		int digits = ("" + b).length();
		for (int i = 0; i < digits; ++i) {
			a *= 10;
		}
		return a + b;
	}

}