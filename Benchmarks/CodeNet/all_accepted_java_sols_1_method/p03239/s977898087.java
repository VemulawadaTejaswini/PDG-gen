import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t0 = sc.nextInt();
		int mincost = 1001;
		
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();
			
			if(t <= t0) {
				mincost = Math.min(mincost, c);
			}
		}
		
		if(mincost == 1001) {
			System.out.println("TLE");
		}else {
			System.out.println(mincost);
		}
	}
}