import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		int[][][] people = new int[4][3][10];
		
		for(int i = 0; i < n; i++){
			final int b = sc.nextInt() - 1;
			final int f = sc.nextInt() - 1;
			final int r = sc.nextInt() - 1;
			final int v = sc.nextInt();	
			
			people[b][f][r] += v;
		}
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" " + people[i][j][k]);
				}
				System.out.println();
			}
			
			if(i != 3){
				System.out.println("####################");
			}
		}
		
	}

}