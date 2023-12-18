import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] table = new int[r + 1][c + 1];
		int[] sumR = new int[c + 1];

		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				int n = scan.nextInt();
				table[i][j] = n;
			}
		}
		
		int sumC = 0;
		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				if(i != r){
					sumR[j] += table[i][j];
					if(j != c){
						sumC += table[i][j];
					} else{
						table[i][j] = sumC;
					}
				} else{
					table[i][j] =sumR[j];
				}
			}
			
		}
	
		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				if(j != c){
					System.out.printf("%d ", table[i][j]);
				} else{
					System.out.printf("%d\n", table[i][j]);
				}
			}
		}
	}
}