import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.Comparator;


public class Main {

	static int M;
	static int[] ss;
	static int[] sum2;

	static int max(int low, int high, int sumMax) {
		int mid = (low + high) / 2;
		if(sum2[mid] < sumMax) {
			if(low == mid) {
				return sum2[mid];
			}
			if(mid < high && !(sum2[mid+1] < sumMax) ) {
				return sum2[mid];
			}
			return max(mid, high, sumMax);
		}
		return max(low, mid, sumMax);
	}

	static int serach() {
		HashSet<Integer> pairs = new HashSet<>();
		for(int i = 0; i < ss.length; i++) {
			for(int j = 0; j < ss.length; j++) {
				pairs.add(ss[i]+ss[j]);
			}
		}
		sum2 = new int[pairs.size()];
		int c = 0;
		for(Integer n: pairs) {
			sum2[c++] = n;
		}
		Arrays.sort(sum2);
		int max = 0;
		for(int i = sum2.length-1; i >= 0; i--) {
			int m = M - sum2[i];
			if(m == 0) return M;
			if(m > 0) {
				max = Math.max(max, max(0, i, m) + sum2[i]);
				if(sum2[i] * 2 < max) {
					break;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int N = sc.nextInt();
				M = sc.nextInt();
				if((M | N) == 0) break;
				ss = new int[N+1];
				for(int i = 0; i < N; i++) {
					ss[i] = sc.nextInt();
				}
				System.out.println(serach());
			}
		}
	}
}
	
