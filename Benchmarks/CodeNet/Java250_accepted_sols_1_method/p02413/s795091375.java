import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int tblData[][] = new int[c+1][r+1];
		
		//???????????\???
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				tblData[j][i] = sc.nextInt();
			}
		}
		
		//????????????????¨?
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				tblData[c][i] = tblData[c][i] + tblData[j][i];
			}
		}
		
		//????????????????¨?
		for(int j = 0; j < c; j++) {
			for(int i = 0; i < r; i++) {
				tblData[j][r] = tblData[j][r] + tblData[j][i];
			}
		}
		
		//???????¨?
		for(int i = 0; i < r; i++) {
			tblData[c][r] = tblData[c][r] + tblData[c][i];
		}
		
		for(int i = 0; i < r + 1; i++) {
			for(int j = 0; j < c + 1; j++) {
				if(j != c) {
					System.out.printf("%d ", tblData[j][i]);
				} else if(j == c) {
					System.out.printf("%d", tblData[j][i]);
				}
			}
			System.out.println();
		}
	}
}