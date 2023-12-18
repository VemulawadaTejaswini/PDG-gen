import java.util.Scanner;

public class Main {

	static int[] v1 = {0,0, 1, 0, -1};
	static int[] v2 = {0,1, 0, -1, 0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int[][][] field = new int[n*2+2][n*2+2][2];
			int midx = n/2+1, midy=n/2+1;
			for(int i = 0; i < n;i++){
				int t = cin.nextInt();
				int f = cin.nextInt();
				int x =midx, y = midy;
				Dice a = new Dice(t, f);
				while(true){
					int max=0, dir=0;
					for(int j = 1; j < 5;j++){
						if(max < a.dice[j]){
							if(field[x][y][0] > field[x+v1[j]][y+v2[j]][0]){
								max = a.dice[j];
								dir = j;
							}
						}
					}
					if(max >= 4){
						a.dice = a.roll(dir);
						x = x+v1[dir];
						y = y+v2[dir];
					}
					else{
						break;
					}
				}
				field[x][y][0]++;
				field[x][y][1]= a.dice[0];
			}
			int[] count = new int[7];
			for(int i = 0; i < field[0].length;i++){
				for(int j = 0; j < field[0].length;j++){
					count[field[i][j][1]]++;
				}
			}
			System.out.print(count[1]);
			for(int i = 2; i < 7;i++){
				System.out.print(" " + count[i]);
			}
			System.out.println();
		}

	}

}
class Dice {
	static int[] dice;
	static int[][] dice_table=
	{   {  0, 0, 0, 0, 0, 0, 0},
		{  0, 0, 3, 5, 2, 4, 0},
		{  0, 4, 0, 1, 6, 0, 3},
		{  0, 2, 6, 0, 0, 1, 5},
		{  0, 5, 1, 0, 0, 6, 2},
		{  0, 3, 0, 6, 1, 0, 4},
		{  0, 0, 4, 2, 5, 3, 0}

	};

	public static void main(String[] args) {

	}
	Dice(int x, int y){
		dice = new int[6];
		dice[0] = x;
		dice[1] = y;
		dice[2] = dice_table[x][y];
		dice[3] = 7-y;
		dice[4] = dice_table[y][x];
		dice[5] = 7-x;
	}
	// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0502
	static int[] roll(int dir){
		int[] b = new int[6];
		if(dir==1){// South
			b[0]=dice[3];
			b[1]=dice[0];
			b[2]=dice[2];
			b[3]=dice[5];
			b[4]=dice[4];
			b[5]=dice[1];
		}
		else if(dir==2){// East
			b[0]=dice[4];
			b[1]=dice[1];
			b[2]=dice[0];
			b[3]=dice[3];
			b[4]=dice[5];
			b[5]=dice[2];
		}
		else if(dir==3){// North
			b[0]=dice[1];
			b[1]=dice[5];
			b[2]=dice[2];
			b[3]=dice[0];
			b[4]=dice[4];
			b[5]=dice[3];
		}
		else if(dir==4){// West
			b[0]=dice[2];
			b[1]=dice[1];
			b[2]=dice[5];
			b[3]=dice[3];
			b[4]=dice[0];
			b[5]=dice[4];
		}
		else if(dir == 5){// Left
			b[0]=dice[0];
			b[1]=dice[4];
			b[2]=dice[1];
			b[3]=dice[2];
			b[4]=dice[3];
			b[5]=dice[5];
		}
		else{// Right
			b[0]=dice[0];
			b[1]=dice[2];
			b[2]=dice[3];
			b[3]=dice[4];
			b[4]=dice[1];
			b[5]=dice[5];
		}
		return b;
	}
}