import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		int n, t;
		int minCost = 1001;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		t = sc.nextInt();

		for(int i = 0; i < n; ++i) {
			int ci = sc.nextInt();
			int ti = sc.nextInt();
			if(ti <= t) {
				minCost = Math.min(minCost, ci);
			}
		}

		if(minCost == 1001) {
			System.out.println("TLE");
		} else {
			System.out.println(minCost);
		}
	}
}
