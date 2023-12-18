import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] S = new int[n];
		for(int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int[] T = new int[n + q];
		for(int i = 0; i < q; i++) {
			T[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++) {
			T[q + i] = S[i];
		}

		Set<Integer> C = new HashSet<Integer>();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < q; j++) {
				if(T[j] == T[q + i]) {
					C.add(j);
				}
			}
		}
		Integer[] afterC = C.toArray(new Integer[0]);
		System.out.println(afterC.length);



	}

}
