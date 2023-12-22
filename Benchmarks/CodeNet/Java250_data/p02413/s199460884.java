import java.util.Scanner;

public class Main {
	void spread(){
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int rxc[][] = new int[r+1][c+1];
		for(int i = 0;i < r;i++){
			int sumJ = 0;
			for(int j = 0;j<c;j++){
				rxc[i][j] = s.nextInt();
				sumJ+=rxc[i][j];
			}
			rxc[i][c] = sumJ;
		}
		for(int j = 0;j < c + 1;j++){
			int sumI = 0;
			for(int i = 0;i < r;i++){
				sumI+=rxc[i][j];
			}
			rxc[r][j] = sumI;
		}
		for(int i = 0;i < r+1;i++){
			for(int j = 0;j < c+1;j++){
				System.out.print(rxc[i][j]);
				if(j < c){
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.spread();
	}
}