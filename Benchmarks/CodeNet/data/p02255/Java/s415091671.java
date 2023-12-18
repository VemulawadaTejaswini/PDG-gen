package Vol0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int N;
	private static long[] A;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		String[] arrays = br.readLine().split(" ");
		A = new long[N];
		for (int i = 0, idx = 0; i < arrays.length; i++) {
			if(arrays[i].length() == 0) continue;
			A[idx++] = Long.parseLong(arrays[i].trim());
		}

		try {
		// 挿入ソート
		for (int i = 0; i < N; i++) {
			for (int j = i; j >= 1 && A[j] < A[j - 1]; j--) {
				long tmp = A[j];
				A[j] = A[j - 1];
				A[j - 1] = tmp;
			}
			System.out.print(A[0]);
			for (int j = 1; j < N; j++) {
				System.out.print(" " + A[j]);
			}
			System.out.println("");

		}
		} catch(Exception e){
			
		}
	}
}