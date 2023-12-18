import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[][] field = new int[10][10];
		int max = 0, count=0;

		while(cin.hasNext()){
			String str = cin.next();
			String[] s = str.split(",");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int size = Integer.parseInt(s[2]);
			int[] v11={1,0,-1,0};
			int[] v12={0,1,0,-1};
			int[] v21={1,-1,1,-1};
			int[] v22={1,1,-1,-1};
			int[] v31={2,0,-2,0};
			int[] v32={0,2,0,-2};
			field[x][y]++;
			for(int i = 0; i < 4;i++){
				if(inRange(x+v11[i], y+v12[i])){
					field[x+v11[i]][y+v12[i]]++;
				}
			}
			if(size==1){
				continue;
			}
			for(int i = 0; i < 4;i++){
				if(inRange(x+v21[i], y+v22[i])){
					field[x+v21[i]][y+v22[i]]++;
				}
			}
			if(size==2){
				continue;
			}
			for(int i = 0; i < 4;i++){
				if(inRange(x+v31[i], y+v32[i])){
					field[x+v31[i]][y+v32[i]]++;
				}
			}
		}
		for(int i = 0; i < 10;i++){
			for(int j = 0; j < 10;j++){
				System.out.print(field[i][j] + "  " );
				if(max < field[i][j]){
					max = field[i][j];
				}
				if(field[i][j] == 0){
					count++;
				}
			}
			System.out.println();
		}
		System.out.println(count);
		System.out.println(max);
	}
	static boolean inRange(int i , int j){
		if(i >= 0 && i < 10 && j >= 0 && j < 10){
			return true;
		}
		else{
			return false;
		}
	}
}