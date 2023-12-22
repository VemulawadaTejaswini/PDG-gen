import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxt = sc.nextInt();
		int[] c = new int[n];
		int[] t = new int[n];
		int minc = 0;
		int minct = 0;
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
			if (i == 0) {
				minc = c[i];
				minct = t[i];
			} else {
				if (t[i] <= maxt) {
					if (c[i] < minc) {
						minc = c[i];
						minct = t[i];
					}
				}
			}
		}
		if (minct > maxt) {
			System.out.println("TLE");
		} else {
			System.out.println(minc);
		}
 	}
}
