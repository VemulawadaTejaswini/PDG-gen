import java.util.*;

public class Main {
	static int[][] paper = new int[10][10];
	static void draw(int a,int b){
		if(a<0||a>9||b<0||b>9) return;
		paper[a][b] += 1;
	}
	static void drawsmall(int a,int b){
		draw(a,b);draw(a,b-1);draw(a,b+1);draw(a+1,b);draw(a-1,b);
		return;
	}
	static void drawmid(int a,int b){
		drawsmall(a,b);draw(a-1,b-1);draw(a-1,b+1);draw(a+1,b-1);draw(a+1,b+1);
		return;
	}
	static void drawlarge(int a, int b){
		drawmid(a,b);draw(a-2,b);draw(a+2,b);draw(a,b-2);draw(a,b+2);
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",");
		int zerocount = 0,max = 0;
		int[][] paper = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				paper[i][j] = 0;
			}
		}
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int size = sc.nextInt();
			switch (size) {
			case 1:
				drawsmall(x,y);
				break;
			case 2:
				drawmid(x,y);
				break;
			case 3:
				drawlarge(x,y);
				break;
			}
		}
		for(int k = 0; k < 10;k++){
			for(int l = 0;l < 10;l++){
				if(paper[k][l] == 0){
					zerocount++;
				}
				if(paper[k][l] >= max){
					paper[k][l] = max;
				}
			}
		}
		System.out.printf("%d\n%d\n",zerocount,max);
	}
	
}