import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] T = new int[m];
		for (int j = 0; j < m; j++) {
			T[j] = sc.nextInt();
		}
	System.out.println(binSearch(S, n, T, m));
	}

	static int binSearch(int[] array, int n, int[] array1, int m) {
		int count = 0;
		for (int i = 0; i < m; i++) {
			int key = array1[i];
			int pl = 0;
			int pr = n - 1;
			do {
				int pc = (pr + pl) / 2;
			if (array[pc] == key) {
				count++;
				break;
			} else if (array[pc] < key){
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
			} while (pl <= pr);
		}
		return count;
	}
}
