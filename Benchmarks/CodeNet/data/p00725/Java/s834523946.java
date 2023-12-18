import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int w = Integer.parseInt(tmpArray[0]);
			int h = Integer.parseInt(tmpArray[1]);

			if(w == 0 && h == 0){
				break;
			}

			int[][] matrix = new int[h][w];

			int x = 0;
			int y = 0;
			for(int i = 0; i < h; i++){
				tmpArray = br.readLine().split(" ");

				for(int j = 0; j < w; j++){
					matrix[i][j] = Integer.parseInt(tmpArray[j]);

					if(matrix[i][j] == 2){
						x = j;
						y = i;
					}
				}
			}
//			System.out.println("Start from "+x+" "+y);
			int result = dfs(matrix, w, h, x, y, 0, 0, 0);
			if(result >= 0 && result <= 10){
				System.out.println(result);
			}
			else {
				System.out.println(-1);
			}
		}
	}

	static int dfs(int[][] matrix, int w, int h, int x, int y, int vx, int vy, int step){
		int result = Integer.MAX_VALUE;
		int breakPosX = -1;
		int breakPosY = -1;
		
		if(step > 10){
			return Integer.MAX_VALUE;
		}

//		System.out.println("STEP " +step+" now "+x+" "+y);
//
//		if(vx == 1){
//			System.out.println("RIGHT");
//		}
//		if(vx == -1){
//			System.out.println("LEFT");
//		}
//		if(vy == 1){
//			System.out.println("DOWN");
//		}
//		if(vy == -1){
//			System.out.println("UP");
//		}

		//???????????¨???????????§?????????
		if(!(vx == 0 && vy == 0)){
			int i = 0;
			while(true){
				//?????????
				if(y + vy*i >= h || x + vx*i >= w || y + vy*i < 0 || x + vx*i < 0){
					//System.out.println("RANGE ERROR " +(y + vy*i )+" "+ (x + vx*i)+" "+( y + vy*i) +" "+ (x + vx*i));
					return Integer.MAX_VALUE;
				}
				//??´????????°???
				if(matrix[y+vy*i][x+vx*i] == 3){
//					System.out.println("GOAL!!");
					return step;
				}

				//??????????????????
				if(matrix[y+vy*(i)][x+vx*(i)] == 1){
					//?????????????????????????????´???
					if(i == 0){
//						System.out.println("COLLISION");
						return Integer.MAX_VALUE;
					}
					matrix[y+vy*(i)][x+vx*(i)] = 0;
					breakPosX = x + vx*(i);
					breakPosY = y + vy*(i);
//					System.out.println("Break "+breakPosX+" "+breakPosY);
					x = x + vx*(i - 1);
					y = y + vy*(i - 1);
					break;
				}

				i++;
			}
		}


//		System.out.println("Now X, Y " + x+ " "+y);

		int tmp;
		//???

		if((tmp = dfs(matrix, w, h, x, y - 1, 0, -1, step+1)) < result){
			result = tmp;
		}

		//???
		if((tmp = dfs(matrix, w, h, x + 1, y, 1, 0, step+1)) < result){
			result = tmp;
		}

		//???
		if((tmp = dfs(matrix, w, h, x - 1, y, -1, 0, step+1)) < result){
			result = tmp;
		}

		//???
		if((tmp = dfs(matrix, w, h, x, y + 1, 0, 1, step+1)) < result){
			result = tmp;
		}

		if(breakPosY >= 0 && breakPosX >= 0){
			matrix[breakPosY][breakPosX] = 1;
		}

//		if(result > 10){
//			return -1;
//		}

		if(vx == 0 && vy == 0){
			return result;
		}
		return result;
	}

}