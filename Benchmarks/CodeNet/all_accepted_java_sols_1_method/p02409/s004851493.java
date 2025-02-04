import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][][] rp = new int[4][3][10];
		
		for(int db = 0; db < 4; db++) {
			for(int df = 0; df < 3; df++) {
				for(int dr = 0; dr < 10; dr++) {
					rp[db][df][dr] = 0;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			
			rp[b-1][f-1][r-1] += v;
		}
		
		for(int pb = 0; pb < 4; pb++) {
			if(pb != 0) {
				System.out.println("####################");
			}
			for(int pf = 0; pf < 3; pf++) {
				for(int pr = 0; pr < 10; pr++) {
					System.out.print(" " + rp[pb][pf][pr]);
				}
				System.out.println();
			}
		}
	}
}

