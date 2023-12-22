import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		int N = S.nextInt();
		int[][][] room = new int[4][3][10];
		
		for(int i = 0;i< N;i++){
			int b = S.nextInt();
			int f = S.nextInt();
			int r = S.nextInt();
			int v = S.nextInt();
			
			room[b - 1][f - 1][r - 1] += v;
		}
		
		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 3;j++){
				for(int s = 0;s < 10;s++){
					System.out.print(" "+room[i][j][s]);
				}
				System.out.println();
			}
			if(i != 3)
			System.out.println("####################");
		}	
	}
}