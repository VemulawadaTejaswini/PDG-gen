import java.util.Scanner;
public class Main{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int Map [][] = new int[10][10];
		try {
			String temp = sc.nextLine();
			String[] str = temp.split(",");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int scale = Integer.parseInt(str[2]);

			if(scale >= 1){
				if(judge(x, y)){
					Map[x][y]++;
				}
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
			}
			if(scale >= 2){
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
			if(scale >= 3){
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

			int rem = 0;
			int max = 0;

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(Map[i][j] == 0) rem++;
					if(Map[i][j] > max) max++;
				}
			}
			System.out.println(rem + "\n" + max);
		} catch (NumberFormatException e) {
			System.err.println("err");
		}

	}

	static  boolean judge(int x, int y){
		if(x < 0 || x > 9 || y < 0 || y > 10)return false;
		else return true;

	}
}