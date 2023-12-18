import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		long A[][] = new long[N][S + 1];
		long sum = 0;
		long B[] = new long[3000];
		B[0] = 1;
		for (int i = 1; i < 3000; i++) {
			B[i] = (B[i - 1] * 2) % 998244353;
		}
		for (int i = 0; i < N; i++) {
			Set<Integer> se = new HashSet<Integer>();
			list.add(se);
			int temp = sc.nextInt();
			if (temp > S) {
				continue;
			}
			for (int j = i - 1; j >= 0; j--) {
				Set<Integer> set = list.get(j);
				Set<Integer> t1 = list.get(j + 1);
				for (Integer in : set) {
					if (in + temp <= S) {
						t1.add(in + temp);
						A[j + 1][in + temp] += A[j][in];
					}
				}
			}
			Set<Integer> zero = list.get(0);
			zero.add(temp);
			A[0][temp]++;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < A[i][S]; j++) {
				sum = (sum + B[N - i - 1] % 998244353) % 998244353;
			}
		}
		System.out.println(sum);
	}
}