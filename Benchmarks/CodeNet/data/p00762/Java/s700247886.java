import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[][] height = new int[201][201];
			int[][] top = new int[201][201];
			for(int i=0;i<n;i++) {
				int t = sc.nextInt();
				int f = sc.nextInt();
				int x = 100;
				int y = 100;
				Dice d = new Dice(t, f);
				ROLL: while(true) {
					int dir = -1;
					int max = -1;
					if (d.right  >= 4 && height[x][y] > height[x+1][y]) {
						if (d.right > max) {
							max = d.right;
							dir = 0;
						}
					}
					if (d.back  >= 4 && height[x][y] > height[x][y+1]) {
						if (d.back > max) {
							max = d.back;
							dir = 1;
						}
					}
					if (d.left  >= 4 && height[x][y] > height[x-1][y]) {
						if (d.left > max) {
							max = d.left;
							dir = 2;
						}
					}
					if (d.front  >= 4 && height[x][y] > height[x][y-1]) {
						if (d.front > max) {
							max = d.front;
							dir = 3;
						}
					}
					switch (dir) {
					case 0:
						d.rollRight();
						x++;
						break;
					case 1:
						d.rollBack();
						y++;
						break;
					case 2:
						d.rollLeft();
						x--;
						break;
					case 3:
						d.rollFront();
						y--;
						break;
					default:
						break ROLL;
					}
				}
				height[x][y]++;
				top[x][y] = d.top;
			}
			int[] ans = new int[7];
			for(int i=0;i<=200;i++) {
				for(int j=0;j<=200;j++) {
					ans[top[i][j]]++;
				}
			}
			System.out.print(ans[1]);
			for(int i=2;i<=6;i++) {
				System.out.print(" " + ans[i]);
			}
			System.out.println();
		}
	}

}
class Dice {
	int[][] d = {{-1,3,5,2,4,-1},{4,-1,1,6,-1,3},{2,6,-1,-1,1,5},{5,1,-1,-1,6,2},{3,-1,6,1,-1,4},{-1,4,2,5,3,-1}};
	int top,bottom,front,back,right,left;
	public Dice(int top,int front) {
		this.top = top;
		this.front = front;
		this.right = d[top-1][front-1];
		this.bottom = 7 - top;
		this.back = 7 - front;
		this.left = 7 - right;
	}
	public void rollRight() {
		int temp = top;
		top = left;
		left = bottom;
		bottom = right;
		right = temp;
	}
	public void rollLeft() {
		rollRight();
		rollRight();
		rollRight();
	}
	public void rollFront() {
		int temp = top;
		top = back;
		back = bottom;
		bottom = front;
		front = temp;
	}
	public void rollBack() {
		rollFront();
		rollFront();
		rollFront();
	}
}