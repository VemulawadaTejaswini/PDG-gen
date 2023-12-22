import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] table = new int[r + 1][c + 1];
		int[] sumC = new int[c + 1];

		for(int i = 0; i < r ; i++){
			for(int j = 0; j < c; j++){
				int n = scan.nextInt();
				table[i][j] = n;
			}
		}

		for(int i = 0; i < r + 1; i++){
			int sum = 0;
			for(int j = 0; j < c + 1; j++){
				if(i != r){
					if(j != c){
						sum = sum + table[i][j];
						sumC[j] = sumC[j] + table[i][j];
					} else if(j == c){
						table[i][c] = sum;
						sumC[c] = sumC[c] + table[i][c];
					}
				} else if(i == r){
					table[r][j] = sumC[j];
				}
			}
		}

		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				System.out.printf((j != c) ? "%d " : "%d\n", table[i][j]);
			}
		}
	}
}