import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int H = keyboard.nextInt();
		int W = keyboard.nextInt();
		int count = keyboard.nextInt();
		int[][]M = new int[H+1][W+1];
		int[]sumH = new int[H+1];
		int[]sumW = new int[W+1];
		
		for(int i = 0; i<count; i++) {
			int inH = keyboard.nextInt();
			int inW = keyboard.nextInt();
			M[inH][inW] = 9;
			sumH[inH] ++;
			sumW[inW] ++;
			
		}
		
		int ans = 0;
		
		for(int h=1; h<=H; h++) {
			for(int w=1; w<=W; w++) {
				int sum = 0;
				if(M[h][w] == 9) {
					sum = sumH[h]+sumW[w]-1;
				}else {
					sum = sumH[h]+sumW[w];
				}
				
				if(ans <= sum) {
					ans = sum;
				}
			}
		}
		
		System.out.print(ans);
		keyboard.close();
	}
}