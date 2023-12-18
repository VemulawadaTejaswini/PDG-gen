
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int r = sc.nextInt();
			int c = sc.nextInt();
			if(r==0 && c==0)
				break;
			
			int[][] field = new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					field[i][j] = sc.nextInt();
				}
			}
			
			solve(r, c, field);
		}
	}

	private void solve(int r, int c, int[][] field) {
		int[][] reverseField = new int[r][c];
		for(int i=0;i<field.length;i++){
			for(int j=0;j<field[i].length;j++){
				reverseField[i][j] = 1-field[i][j];
			}
		}
		
		int res = 0;
		int[][] curField = new int[r][c];
		for(int i=0;i<(1<<r);i++){
			for(int j=0;j<r;j++){
				if((i>>j)%2==0)
					curField[j] = reverseField[j];
				else
					curField[j] = field[j];

			}
			res = Math.max(res, calcFineOsenbei(curField));
		}
		System.out.println(res);
	}

	private int calcFineOsenbei(int[][] field){
		int res = 0;
		for(int i=0;i<field[0].length;i++){
			int rowCount = 0;
			for(int j=0;j<field.length;j++){
				rowCount += field[j][i];
			}
			res += Math.max(rowCount, field.length-rowCount);
		}
		return res;
	}
}