import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}

		int q = scan.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = scan.nextInt();
		}

		Set<Integer> C = new HashSet<Integer>();


		for (int i = 0; i < q; i++) {
			int head = 0;
			int tail = n - 1;

			while(head <= tail) {
				int center = (head + tail) / 2;
				if(S[center] == T[i]){
					C.add(i);
					break;
				} else if (S[center] < T[i]) {
					head = center + 1;
				} else {
					tail = center - 1;
				}
			}
		}

		Integer[] afterC = C.toArray(new Integer[0]);
		System.out.println(afterC.length);

		scan.close();
	}

}

