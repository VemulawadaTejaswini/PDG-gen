	import java.io.*;
	import java.util.*;
	
	class Main {
		static BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));
	
		public static void main(String[] args) throws IOException {
			int N = Integer.parseInt(br.readLine());
			String A1[] = br.readLine().split(" ");
			String A2[] = Arrays.copyOf(A1, N);
			bubblesort(A1, N);
			selectsort(A2, N);
			isstable(A1, A2);
			for (int i = 0; i < N; i++) {
				if (i != 0)
					System.out.print(" ");
				System.out.print(A1[i]);
			}
			System.out.println("\n" + "Stable");
			for (int i = 0; i < N; i++) {
				if (i != 0)
					System.out.print(" ");
				System.out.print(A2[i]);
			}
			if (isstable(A1, A2)) {
				System.out.println("\n" + "Stable");
			} else {
				System.out.println("\n" + "Not Stable");
	
			}
	
		}
	
		public static void bubblesort(String[] A, int N) {
			for (int i = 0; i < N-1; i++) {
				for (int j = N - 1; j > i; j--) {
					if (A[j].charAt(1) < A[j - 1].charAt(1)) {
						String tmp = A[j];
						A[j] = A[j - 1];
						A[j - 1] = tmp;
					}
				}
			}
		}
	
		public static void selectsort(String[] A, int N) {
			for (int i = 0; i < N; i++) {
				int min = i;
				for (int j = i+1; j < N; j++) {
					if (A[j].charAt(1) < A[min].charAt(1)) {
						min = j;
					}
				}
				if (i != min) {
					String t = A[i];
					A[i] = A[min];
					A[min] = t;
				}
			}
		}
	
		public static boolean isstable(String[] A1, String[] A2) {
			for (int i = 0; i < A1.length; i++) {
				if (A1[i].charAt(0) != A2[i].charAt(0)) {
					return false;
				}
			}
			return true;
		}
	}