import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = sc.nextInt();
		
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			int L = sc.nextInt(); int R = sc.nextInt(); int target = sc.nextInt();
			int num = 0;
			for (int j=L; j<R; j++) {
				if (ar[j] == target) num++;
			}
			System.out.println(num);
		}
		
	}
}
