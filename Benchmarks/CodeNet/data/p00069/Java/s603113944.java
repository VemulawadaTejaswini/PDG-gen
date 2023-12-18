import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, g, d;
		int[][] horizontalLine = null;
		while((n = sc.nextInt()) != 0){
			m = sc.nextInt();
			g = sc.nextInt();
			d = sc.nextInt();
			horizontalLine = new int[d][n - 1];
			for(int i = 0; i < horizontalLine.length; i++){
				String input = sc.next();
				for(int j = 0; j < horizontalLine[0].length; j++){
					horizontalLine[i][j] = Integer.parseInt(String.valueOf(input.charAt(0 + j)));
				}
			}
			if(m - 1 == getLineToGoal(g - 1, horizontalLine)[0]){
				System.out.println("0");
			}else{
				int[] o = getNewLinePosition(getPosition(m - 1, horizontalLine), getLineToGoal(g - 1, horizontalLine), horizontalLine);
				System.out.println((o == null)? "1" : ((o[0] + 1) + " " + (o[1] + 1)));
			}
		}
		sc.close();
	}
	
	public static int[] getNewLinePosition(int[] pos, int[] goal, int[][] horizontalLine){
		//経路情報を上から参照していく
		for(int d = 0; d < pos.length; d++){
			//隣り合っていて、線を引くことが出来る場合段数を返す
			if(Math.abs(pos[d] - goal[d]) == 1){
				int min = Math.min(pos[d], goal[d]);
				int max = Math.max(pos[d], goal[d]);
				//チェック
				if(min != 0 && horizontalLine[d][min -1] == 1)	continue;
				if(min < horizontalLine[0].length && horizontalLine[d][min] == 1)	continue;
				if(max < horizontalLine[0].length && horizontalLine[d][max] == 1)	continue;
				
				return new int[]{d, Math.min(pos[d], goal[d])};
			}
		}
		return null;
	}
	public static int[] getPosition(int n, int[][] horizontalLine){
		int[] pos = new int[horizontalLine.length];
		//横線情報を上から参照していく
		int currentPos = n;
		int tmp;
		for(int d = 0; d < horizontalLine.length; d++){
			tmp = currentPos;
			//左となりの縦線チェック
			if(tmp != 0 && horizontalLine[d][tmp - 1] == 1){
				currentPos--;
			}
			//右となりの縦線チェック
			else if(tmp != horizontalLine[0].length && horizontalLine[d][tmp] == 1){
				currentPos++;
			}
			pos[d] = currentPos;
		}
		return pos;
	}

	public static int[] getLineToGoal(int goal, int[][] horizontalLine){
		int[] goalOn = new int[horizontalLine.length];
		//横線情報を下から参照していく
		int currentGoal = goal;
		int tmp;
		for(int d = horizontalLine.length - 1; d >= 0; d--){
			tmp = currentGoal;
			//左となりの縦線チェック
			if(tmp != 0 && horizontalLine[d][tmp - 1] == 1){
				currentGoal--;
			}
			//右となりの縦線チェック
			else if(tmp != horizontalLine[0].length && horizontalLine[d][tmp] == 1){
				currentGoal++;
			}
			goalOn[d] = tmp;
		}
		return goalOn;
	}
}