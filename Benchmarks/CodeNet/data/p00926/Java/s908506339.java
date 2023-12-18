import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		BitSet bs = new BitSet(N + 1);
		for (int i = 0; i < M; ++i) {
			int C = sc.nextInt();
			int D = sc.nextInt();
			bs.set(C, D);
		}
		System.out.println(N + 1 + bs.cardinality() * 2);
	}

}