import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[][][] houseInfo = new int[4][3][10];	// ?£?/????????¢/??¨?±? number
		
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
		
			houseInfo[b-1][f-1][r-1] += v;
		}

		for(int b = 0; b < 4; b++) {
			int[][] bInfo = houseInfo[b];
			
			for(int[] fInfo : bInfo) {
				for(int h : fInfo) {
					System.out.print(" " + h);
				}
				System.out.println();
			}
			
			if(b != 3) {
				for (int i = 0; i < 20; i++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}