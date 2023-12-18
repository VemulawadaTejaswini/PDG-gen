import java.util.Arrays;
import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_5_A
// BufferedReaderだとTime limitに引っかかる
public class Main {
	void coutingSort(int[] A, int[] B, int k) {
		int[] C = new int[k];
		Arrays.fill(B, 0);
		for (int i = 0; i < A.length; i++) 
			C[A[i]]++;
		
		for (int i = 1; i < k; i++) 
			C[i] += C[i - 1];
		
		for (int i = A.length - 1; i > -1; i--) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]]--;
		}
	}
	
	void run() throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		//String[] str = br.readLine().split(" ");
		StringBuilder build = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			if (A[i] > k) k = A[i];
		}
		coutingSort(A, B, k+1);
		build.append(B[0]);
		for (int i = 1; i < n; i++) {
			build.append(" " + B[i]);
		}
		System.out.println(build);
		sc.close();
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

