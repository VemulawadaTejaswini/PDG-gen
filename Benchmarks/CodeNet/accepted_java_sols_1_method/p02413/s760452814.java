import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int r = Integer.parseInt(std.next());
		int c = Integer.parseInt(std.next());
		int table[][] = new int[r+1][c+1];
		for(int i=0; i<=r-1; i++){
			int rsum = 0;
			for(int j=0; j<=c; j++){
				if(j<c){
					table[i][j] = Integer.parseInt(std.next());
					rsum += table[i][j];
				}else{
					table[i][j] = rsum;
				}
			}
		}
		for(int j=0; j<=c; j++){
			int csum = 0;
			for(int i=0; i<=r; i++){
				if(i<r){
					csum += table[i][j];
				}else{
					table[i][j] = csum;
				}
			}
		}
		for(int i=0; i<=r; i++){
			String line = String.valueOf(table[i][0]);
			for(int j=1; j<=c; j++){
				line += ( " "+ String.valueOf(table[i][j]));
			}
			System.out.println(line);
		}
	}
}