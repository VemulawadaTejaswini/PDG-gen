import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int X= scan.nextInt();
			int [][]A = new int[N][M];
			int []C = new int[N];
			int []x = new int [M];
			long goukei=0;
			long min = Long.MAX_VALUE;
			
			for(int i = 0;i<N;i++) {
				C[i] = scan.nextInt();
				for(int j = 0;j<M;j++) {
					A[i][j] = scan.nextInt();
				}
			}
			
			
			for(int i = 0;i<(int)Math.pow(2, N);i++) {
				int okcount = 0;
				goukei=0;
				Arrays.fill(x, 0);
				
				
				for(int j = 0;j<N;j++) {
					
					if((1&i>>j)==1) {
						goukei+=C[j];
						for(int z = 0;z<M;z++) {
							x[z]+=A[j][z];
						}
					}
					
					
				}
				/*
				for(int j = 0;j<M;j++) {
					System.out.print(x[j]);
					System.out.print(" ");
				}
				System.out.println();
				*/
				for(int j = 0;j<M;j++) {
					if(x[j]>=X) {
						okcount++;
					}
				}
				
				if(okcount==M&&min>goukei) {
					min=goukei;
				}
				
				
			}
			
			
			
			if(min==Long.MAX_VALUE) {
				System.out.println(-1);
			}else {
				System.out.println(min);
			}
			
			
		}
		
		
	}
		

}
