import java.util.Scanner;
public class Main {
	void house(){
		int house[][][] = new int[4][3][10];
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		for(int i = 0;i < cnt;i++){
			int b = s.nextInt();
			int f = s.nextInt();
			int r = s.nextInt();
			int v = s.nextInt();
			house[b-1][f-1][r-1]+=v;
		}
		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 3;j++){
				for(int k = 0;k < 10;k++){
					System.out.print(" " + house[i][j][k]);

				}
				System.out.println("");
			}
			if(i < 3)System.out.println("####################");
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.house();
	}
}