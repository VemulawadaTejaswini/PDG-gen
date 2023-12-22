import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		
		for (int i = 0; i < n; i++) {
			r[i] = sc.nextInt();
		}
		
		int maxv = r[1] - r[0];
		int minv = r[0];
		
		for (int j = 1; j < n; j++) {
			maxv = Math.max(maxv, r[j] - minv);
			minv = Math.min(minv, r[j]);
		}
		
		System.out.println(maxv);
	}
}