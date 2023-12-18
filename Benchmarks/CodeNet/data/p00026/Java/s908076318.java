import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int[][] masu = new int[10][10];
		String input = "";
		int x = -1;
		int y = -1;
		int s = -1;
		int cnt = 0;
		int max = 0;

		for(int i = 0;i < 10;i++){
			for(int j = 0;j <10;j++){
				masu[i][j] = 0;
			}
		}

		try{

			while((input = br.readLine()) != null){
				String[] inputs = input.split(",");
				x = Integer.parseInt(inputs[0]);
				y = Integer.parseInt(inputs[1]);
				s = Integer.parseInt(inputs[2]);

				drop(masu,x,y,s);

			}

		}catch(Exception e){

		}

		for(int i = 0;i < 10;i++){
			for(int j = 0;j <10;j++){
				if(masu[i][j] == 0){
					cnt++;
				}
				if(max <= masu[i][j]){
					max = masu[i][j];
				}
			}
		}

		System.out.println(cnt + "\n" + max);

	}

	static void drop(int brocks[][],int x,int y,int s){
		if(s == 1){
			min_drop(brocks,x,y);
		}
		if(s == 2){
			mid_drop(brocks,x,y);
		}
		if(s == 3){
			lag_drop(brocks,x,y);
		}
	}
	static void min_drop(int brocks[][],int x,int y){
		brocks[x][y]++;
		if(x >= 0){
			brocks[x-1][y] += 1;
		}
		if(x <= 9){
			brocks[x+1][y] += 1;
		}
		if(y >= 0){
			brocks[x][y-1] += 1;
		}
		if(y <= 9){
			brocks[x][y+1] += 1;
		}

	}

	static void mid_drop(int brocks[][],int x,int y){
		min_drop(brocks,x,y);
		if(x >= 0 && y >= 0){
			brocks[x-1][y-1]++;
		}
		if(x <= 9 && y >= 0){
			brocks[x+1][y-1]++;
		}
		if(x >= 0 && y <=9){
			brocks[x-1][y+1]++;
		}
		if(x <= 9 && y<= 9){
			brocks[x+1][y+1]++;
		}

	}

	static void lag_drop(int brocks[][],int x,int y){
		mid_drop(brocks,x,y);
		if(x >= 1){
			brocks[x-2][y]++;
		}
		if(x <= 8){
			brocks[x+2][y]++;
		}
		if(y >= 1){
			brocks[x][y-2]++;
		}
		if(y <= 8){
			brocks[x][y+2]++;
		}
	}

}