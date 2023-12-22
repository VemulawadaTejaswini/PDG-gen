import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int[][] ary = new int[r+1][c+1];
		
		//Insert the given values
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				ary[i][j] = in.nextInt();
			}
		}
		//Calculate the total values
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				ary[i][c] += ary[i][j];
				ary[r][j] += ary[i][j];
				ary[r][c] += ary[i][j];
			}
		}
		//Display the matrix
		for(int i=0; i<r+1; i++){
			for(int j=0; j<c+1; j++){
				System.out.print(ary[i][j]);
				if(j != c){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		in.close();
	}
}