import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int FRONT = 0;
	public static final int RIGHT = 1;
	public static final int LEFT = 2;
	public static final int BACK = 3;

	public static final int[][] right = {
		{0,3,5,2,4,0},
		{4,0,1,6,0,3},
		{2,6,0,0,1,5},
		{5,1,0,0,6,2},
		{3,0,6,1,0,4},
		{0,4,2,5,3,0}
	};
	public static int[][] numTable = new int[211][211];
	public static int[][] upTable = new int[211][211];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			for(int[] b : numTable) Arrays.fill(b, 0);
			for(int[] b : upTable) Arrays.fill(b, 0);
			for(int i = 0; i < n; i++){
				int up = sc.nextInt();
				int front = sc.nextInt();
				isRoll(105,105,up,front,numTable[105][105]);
			}
			print();
		}
	}
	
	public static void print(){
		int[] dice = new int[6];
		for(int[] a : upTable) for(int b : a) if(b > 0) dice[b - 1]++;
		for(int i = 0; i < 5; i++) System.out.print(dice[i] + " ");
		System.out.println(dice[5]);
	}

	public static void isRoll(int x, int y, int up, int front, int high){
		int[] dir = new int[4];
		dir[FRONT] = front;
		dir[BACK] = 7 - front;
		dir[RIGHT] = right[up - 1][front - 1];
		dir[LEFT] = 7 - dir[RIGHT];
		boolean bRoll = false;
		if(high > 0){
			for(int i = 6; i >= 4; i--){
				for(int j = 0; j < 4; j++){
					if(dir[j] == i){
						int xx = x,yy = y;
						int newFront = front, newUp = up; 
						switch(j){
						case FRONT:
							yy--;
							newFront = up;
							newUp = 7 - front;
							break;
						case BACK:
							yy++;
							newFront = 7 - up;
							newUp = front;
							break;
						case RIGHT:
							xx++;
							newFront = front;
							newUp = dir[LEFT];
							break;
						case LEFT:
							xx--;
							newFront = front;
							newUp = dir[RIGHT];
							break;
						}
						if(numTable[xx][yy] < high){
							isRoll(xx,yy,newUp,newFront, numTable[xx][yy]);
							bRoll = true;
							break;
						}
					}
				}
				if(bRoll) break;
			}
		}
		
		if(bRoll == false){
			numTable[x][y]++;
			upTable[x][y] = up;
		}
	}
}