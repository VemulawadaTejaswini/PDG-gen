import java.util.Scanner;
public class Main{
	static int Map [][] = new int[10][10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String temp = sc.nextLine();
			String[] str = temp.split(",");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int scale = Integer.parseInt(str[2]);
			process(x,y,scale);

			int rem = 0;
			int max = 0;

			for (int i = 0; i < Map[x].length; i++) {
				for (int j = 0; j < Map[y].length; j++) {
					if(Map[i][j] == 0) rem++;
					if(Map[i][j] > max) max++;
				}

			}
			System.out.println(rem);
			System.out.println(max);
		}


	}
	static void  process(int x, int y, int scale){
		if(judge(x, y-1)){
			Map[x][y-1]++;
		}
		if(judge(x-1, y)){
			Map[x-1][y]++;
		}
		if(judge(x+1, y)){
			Map[x+1][y]++;
		}
		if(judge(x, y+1)){
			Map[x][y+1]++;
		}
		if(scale > 1){
			if(judge(x-1, y-1)){
				Map[x-1][y-1]++;
			}
			if(judge(x+1, y+1)){
				Map[x+1][y+1]++;
			}
			if(judge(x+1, y-1)){
				Map[x+1][y+1]++;
			}
			if(judge(x-1, y+1)){
				Map[x+1][y+1]++;
			}
		}
		if(scale > 2){
			if(judge(x, y-2)){
				Map[x][y-2]++;
			}
			if(judge(x-2, y)){
				Map[x-2][y]++;
			}
			if(judge(x+2, y)){
				Map[x+2][y]++;
			}
			if(judge(x, y+2)){
				Map[x][y+2]++;
			}
		}
	}
	static  boolean judge(int x, int y){
		if(x < 0 || x > 9 || y < 0 || y > 10)return false;
		else return true;

	}
}