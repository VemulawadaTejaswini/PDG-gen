import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in)
							.useDelimiter("[ ,\n]");

	public static void main(String[] args){
		int[][] paper = new int[10][10];
		int count = 0;
		int max = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				paper[i][j] = 0;
			}
		}
		
		while(scan.hasNext()){
			String xs = scan.next();
			String ys = scan.next();
			String sizes = scan.next();
			int x = Integer.parseInt(xs);
			int y = Integer.parseInt(ys);
			int size = Integer.parseInt(sizes);
			if(size == 1){
				if(x-1 < 0){ 
				} else{
					paper[x-1][y] += 1;
				}
				if(x < 0 || x >= 10){
				} else{
					if(y-1 < 0){
					} else{
						paper[x][y-1] += 1;
					}
					if(y < 0 || y >= 10){
					} else{
						paper[x][y] += 1;
					}
					if(y+1 >= 10){
					} else{
						paper[x][y+1] += 1;
					}
				}
				if(x+1 >= 10){
				} else{
					paper[x+1][y] += 1;
				}
			}
			if(size == 2){
				if(x-1 < 0){
				} else{
					if(y-1 < 0){
					} else{
						paper[x-1][y-1] += 1;
					}
					if(y < 0 || y >= 10){
					} else{
						paper[x-1][y] += 1;
					}
					if(y+1 >= 10){
					} else{
						paper[x-1][y+1] += 1;
					}
				}
				if(x < 0 || x >= 10){
				} else{
					if(y-1 < 0){
					} else{
						paper[x][y-1] += 1;
					}
					if(y < 0 || y >= 10){
					} else{
						paper[x][y] += 1;
					}
					if(y+1 >= 10){
					} else{
						paper[x][y+1] += 1;
					}
				}
				if(x+1 >= 10){
				} else{
					if(y-1 < 0){
					} else{
						paper[x+1][y-1] += 1;
					}
					if(y < 0 || y >= 10){
					} else{
						paper[x+1][y] += 1;
					}
					if(y+1 >= 10){
					} else{
						paper[x+1][y+1] += 1;
					}
				}
			}
			if(size == 3){
				if(x-2 < 0){
				} else{
					if(y < 0 || y >= 10){
					} else{
						paper[x-2][y] += 1;
					}
				}
				if(x-1 < 0){
				} else{
					if(y-1 < 0){
					} else{
						paper[x-1][y-1] += 1;
					}
					if(y < 0 || y >= 10){
					} else{
						paper[x-1][y] += 1;
					}
					if(y+1 >= 10){
					} else{
						paper[x-1][y+1] += 1;
					}
				}
				if(x < 0 || x >= 10){
				} else{
					if(y-2 < 0){
					} else{
						paper[x][y-2] += 1;
					}
					if(y-1 < 0){
					} else{
						paper[x][y-1] += 1;
					}
					if(y < 0 || y >= 10){
					} else{
						papaer[x][y] += 1;
					}
					if(y+1 >= 10){
					} else{
						paper[x][y+1] += 1;
					}
					if(y+2 >= 10){
					} else{
						paper[x][y+2] += 1;
					}
				}
				if(x+1 >= 10){
				} else{
					if(y-1 < 0){
					} else{
						paper[x+1][y-1] += 1;
					}
					if(y < 0 || y >= 10){
					} else{
						paper[x+1][y] += 1;
					}
					if(y+1 >= 10){
					} else{
						paper[x+1][y+1] += 1;
					}
				}
				if(x+2 >= 10){
				} else{
					if(y < 0 || y >= 10){
					} else{
						paper[x+2][y] += 1;
					}
				}
			}
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(paper[i][j] == 0){
					count++;
				}
				if(paper[i][j] > max){
					max = paper[i][j];
				}
			}
		}
		System.out.printf("%d\n", count);
		System.out.printf("%d\n", max);
	}
}