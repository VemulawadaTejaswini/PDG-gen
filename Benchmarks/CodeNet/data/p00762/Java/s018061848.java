import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int OP = 105;
	static int[][][] field;
	static int[][] right_ref ={{},
		{0,0,3,5,2,4,0},
		{0,4,0,1,6,0,3},
		{0,2,6,0,0,1,5},
		{0,5,1,0,0,6,2},
		{0,3,0,6,1,0,4},
		{0,0,4,2,5,3,0}};

	static int Setting(int x, int y){
		for(int i=0;;i++){
			if(field[i][x][y]==0){
				return i;
			}
		}
	}

	static void Taosu(int floor, int top, int front, int right){
		int x=OP, y=OP;
		while(true){
			int un_floor = floor-1;
			int flag = 0;
			int max = 0;
			if(un_floor==-1){
				return;
			}
			if(field[un_floor][x-1][y]==0&&front>=4){
				flag = 1;
				max=front;
			}
			if(field[un_floor][x+1][y]==0&&front<=3){
				if(max<7-front){
					flag = 2;
					max=7-front;
				}
			}
			if(field[un_floor][x][y-1]==0&&right<=3){
				if(max<7-right){
					flag = 3;
					max = 7-right;
				}
			}
			if(field[un_floor][x][y+1]==0&&right>=4){
				if(max<right){
					flag = 4;
				}
			}
			if(flag==0){
				return;
			}
			else{
				int put = 0;
				if(flag==1){
					put = Setting(x-1,y);
					field[put][x-1][y] = 7-front;
					field[floor][x][y] = 0;
					int tmp = front;
					front = top;
					top = 7-tmp;
					x--;
				}
				else if(flag==2){
					put = Setting(x+1,y);
					field[put][x+1][y] = front;
					field[floor][x][y] = 0;
					int tmp = front;
					front = 7-top;
					top = tmp;
					x++;
				}
				else if(flag==3){
					put = Setting(x,y-1);
					field[put][x][y-1] = right;
					field[floor][x][y] = 0;
					int tmp = top;
					top = right;
					right = 7-tmp;
					y--;
				}
				else if(flag==4){
					put = Setting(x,y+1);
					field[put][x][y+1] = 7-right;
					field[floor][x][y] = 0;
					int tmp = top;
					top = 7-right;
					right = tmp;
					y++;
				}
				floor = put;
			}
		}	
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] fall_top = new int[n];
			int[] fall_front = new int[n];
			field = new int[110][210][210];
			for(int i=0;i<n;i++){
				fall_top[i] = stdIn.nextInt();
				fall_front[i] = stdIn.nextInt();
			}

			for(int i=0;i<n;i++){
				int tmp = Setting(OP,OP);
				field[tmp][OP][OP] = fall_top[i];
				Taosu(tmp,fall_top[i],fall_front[i],right_ref[fall_top[i]][fall_front[i]]);
			}

			int[] output = new int[7];
			Arrays.fill(output, 0);
			for(int j=0;j<210;j++){
				for(int k=0;k<210;k++){
					for(int i=0;i<109;i++){
						if(field[i+1][j][k]==0&&field[i][j][k]!=0){
							output[field[i][j][k]]++;
						}
						else if(field[i][j][k]==0){
							break;
						}
					}
				}
			}
			for(int i=1;i<6;i++){
				System.out.print(output[i]+" ");
			}
			System.out.println(output[6]);
		}
	}
}