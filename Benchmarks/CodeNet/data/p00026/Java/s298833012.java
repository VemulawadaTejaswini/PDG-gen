import java.util.Scanner;
import java.util.ArrayList;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] slide = new int[10][10];
		while(scan.hasNext()){
			String str = scan.nextLine();
			String[] strary = str.split(",");
			int x = Integer.parseInt(strary[0]);
			int y = Integer.parseInt(strary[1]);
			int size = Integer.parseInt(strary[2]);
			slide[x][y] += 1;
			if(x == 0){
				if(y == 0){
					slide[1][0] += 1;
					slide[0][1] += 1;
					if(size == 2 || size == 3){
						slide[1][1] += 1;
					}
					if(size == 3){
						slide[2][0] += 1;
						slide[0][2] += 1;
					}
				}else if(y == 9){
					slide[0][8] += 1;
					slide[1][9] += 1;
					if(size == 2 || size == 3){
						slide[1][8] += 1;
					}
					if(size == 3){
						slide[0][7] += 1;
						slide[2][9] += 1;
					}
				}else{
					slide[x][y-1] += 1;
					slide[x][y+1] += 1;
					slide[x+1][y] += 1;
					if(size == 2 || size == 3){
						slide[x+1][y-1] += 1;
						slide[x+1][y+1] += 1;
					}
					if(size == 3){
						slide[x+2][y] += 1;
						if(y > 1 && y < 8){
							slide[x][y-2] += 1;
							slide[x][y+2] += 1;
						}else if(y < 2){
							slide[x][y+2] += 1;
						}else{
							slide[x][y-2] += 1;
						}
					}
				}
			}else if(x == 9){
				if(y == 0){
					slide[8][0] += 1;
					slide[9][1] += 1;
					if(size == 2 || size == 3){
						slide[8][1] += 1;
					}
					if(size == 3){
						slide[7][0] += 1;
						slide[9][2] += 1;
					}
				}else if(y == 9){
					slide[9][8] += 1;
					slide[8][9] += 1;
					if(size == 2 || size == 3){
						slide[8][8] += 1;
					}
					if(size == 3){
						slide[9][7] += 1;
						slide[7][9] += 1;
					}
				}else{
					slide[x-1][y] += 1;
					slide[x][y-1] += 1;
					slide[x][y+1] += 1;
					if(size == 2 || size == 3){
						slide[x-1][y-1] += 1;
						slide[x-1][y+1] += 1;
					}
					if(size == 3){
						slide[x-2][y] += 1;
						if(y > 1 && y < 8){
							slide[x][y-2] += 1;
							slide[x][y+2] += 1;
						}else if(y < 2){
							slide[x][y+2] += 1;
						}else{
							slide[x][y-2] += 1;
						}
					}
				}
			}else{
				if(y == 0){
					slide[x-1][y] += 1;
					slide[x][y+1] += 1;
					slide[x+1][y] += 1;
					if(size == 2 || size == 3){
						slide[x-1][y+1] += 1;
						slide[x+1][y+1] += 1;
					}
					if(size == 3){
						slide[x][y+2] += 1;
						if(y > 1 && y < 8){
							slide[x][y-2] += 1;
							slide[x][y+2] += 1;
						}else if(y < 2){
							slide[x][y+2] += 1;
						}else{
							slide[x][y-2] += 1;
						}
					}
				}else if(y == 9){
					slide[x-1][y] += 1;
					slide[x][y-1] += 1;
					slide[x+1][y] += 1;
					if(size == 2 || size == 3){
						slide[x-1][y-1] += 1;
						slide[x+1][y-1] += 1;
					}
					if(size == 3){
						slide[x][y-2] += 1;
						if(y > 1 && y < 8){
							slide[x][y-2] += 1;
							slide[x][y+2] += 1;
						}else if(y < 2){
							slide[x][y+2] += 1;
						}else{
							slide[x][y-2] += 1;
						}
					}
				}else{
					slide[x-1][y] += 1;
					slide[x][y-1] += 1;
					slide[x][y+1] += 1;
					slide[x+1][y] += 1;
					if(size == 2 || size == 3){
						slide[x-1][y-1] += 1;
						slide[x-1][y+1] += 1;
						slide[x+1][y-1] += 1;
						slide[x+1][y+1] += 1;
					}
					if(size == 3){
						slide[x-2][y] += 1;
						slide[x][y-2] += 1;
						slide[x][y+2] += 1;
						slide[x+2][y] += 1;
					}
				}
			}
		}
		int zero = 0;
		int max = 0;
		for(int i = 0;i < 10;i++){
				for(int j = 0;j < 10;j++){
					if(slide[i][j] == 0){
						zero++;
					}
					if(max < slide[i][j]){
						max = slide[i][j];
					}
				}
			}
		System.out.println(zero+"\n"+max);
	}
}