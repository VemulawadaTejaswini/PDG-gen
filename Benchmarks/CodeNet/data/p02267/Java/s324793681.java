import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[] S = new int[n];
		for (int i=0; i<n; i++) {
			S[i] = stdIn.nextInt();
		}

		int q = stdIn.nextInt();
		int[] T = new int[q];
		for (int i=0; i<q; i++) {
			T[i] = stdIn.nextInt();
		}
		
		Arrays.sort(S);
		Arrays.sort(T);

		int count = 0;
		for (int i=0; i<q; i++) {
			if(Arrays.binarySearch(S,T[i]) >= 0)
				count++;
		}

		System.out.println(count);
	}
}