
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int b, f, r, v, n, x[][][], i, j = 0, k;
		Scanner sc = new Scanner(System.in);
		x = new int[5][4][11];
		
		for(j = 0; j < 4; j++){
			for(i = 0; i < 3; i++){
				for(k = 0; k < 10; k++){
					x[j][j][k] = 0;
				}
			}
		}
				
		n = sc.nextInt();
		
		for(i = 0; n > i; i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			x[b - 1][f - 1][r - 1] += v;
			}
		
		for(j = 0; j < 4; j++){
			for(i = 0; i < 3; i++){
				for(k = 0; k < 10; k++){
					System.out.print(" " + x[j][i][k]);
				}
				System.out.print("\n");
			}
			if(j != 3)
				System.out.println("####################");
		}
	}	
}