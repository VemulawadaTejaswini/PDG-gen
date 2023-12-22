import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int home1[][] = new int[3][10];
		int home2[][] = new int[3][10];
		int home3[][] = new int[3][10];
		int home4[][] = new int[3][10];
		for(int i = 0; i < n; i++){
			int b = s.nextInt();
			int f = s.nextInt();
			int r = s.nextInt();
			int v = s.nextInt();
			if(b == 1) home1[f - 1][r - 1] = home1[f - 1][r - 1] + v;
			if(b == 2) home2[f - 1][r - 1] = home2[f - 1][r - 1] + v;
			if(b == 3) home3[f - 1][r - 1] = home3[f - 1][r - 1] + v;
			if(b == 4) home4[f - 1][r - 1] = home4[f - 1][r - 1] + v;
		}
		for(int a = 0; a < 4; a++){
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 10;j++){
					
						if (a == 0) System.out.print(" " + home1[i][j]);
						else if(a == 1) System.out.print(" " + home2[i][j]);
						else if(a == 2) System.out.print(" " + home3[i][j]);
						else if(a == 3) System.out.print(" " + home4[i][j]);
	
				}
				System.out.println();
			}
			if(a != 3) System.out.println("####################");
		}
	}

	public static void main(String[] args) {
		/* 
		 * Main x;
		 * x = new Main();
		 * x.run();
		 * ??¨????????????
		 */
		new Main().run();
		
	}
}