import java.util.Scanner;

public class Main {
	static int crd[];
	static int num[];
	static int n;
	static int x;
	
	public static int f(int sum, int preIndex, int k) {
		if (x < sum) {
			return 0;
		} else if (sum == x) {
			return 1;
		}
		
		int count = 0;
		for (int i = preIndex; 0 <= i; i--) {
			if (i == preIndex && k < num[i]) {
				count += f(sum + crd[i], i, k + 1);
			} else if (i != preIndex) {
				count += f(sum + crd[i], i, 1);
			}
		}
		
		return count;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			crd = new int[n];
			num = new int[n];
			for (int i = 0; i < n; i++) {
				crd[i] = sc.nextInt();
				num[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				x = sc.nextInt();
				System.out.println(f(0, n - 1, 0));
			}
		}
	}
}