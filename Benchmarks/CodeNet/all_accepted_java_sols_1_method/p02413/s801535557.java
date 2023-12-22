import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] rc = new int [r+1][c+1];
		//r???c?????????????????????
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				rc[i][j] = scan.nextInt();
			}
		}
		//???+1???????????????
		for(int i=0; i<c; i++){
			rc[r][i] = 0;
			for(int j=0; j<r; j++){
				rc[r][i] += rc[j][i];
			}
		}
		// c+1???????????????
		for(int i=0; i<r+1; i++){
			rc[i][c] = 0;
			for(int j=0; j<c; j++){
				rc[i][c] += rc[i][j];
			}
		}
		for(int i=0; i<r+1; i++){
			for(int j=0; j<c; j++){
				System.out.print(rc[i][j] + " ");
			}
			System.out.println(rc[i][c]);
		}
	}
}