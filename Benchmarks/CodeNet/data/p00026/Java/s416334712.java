import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in)
							.useDelimiter("[ \t\n,]");

	public static void main(String[] args){

		int[][] paper = new int[10][10];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				paper[i][j] = 0;
			}
		}
		int count = 0;
		int max = 0;
		while(scan.hasNext()){

			int x = scan.nextInt();
			int y = scan.nextInt();
			int s = scan.nextInt();
			if(s == 1){
				paper[x-1][y] += 1;
				paper[x][y-1] += 1;
				paper[x][y] += 1;
				paper[x][y+1] += 1;
				paper[x+1][y] += 1;
			} else if(s == 2){
				paper[x-1][y-1] += 1;
				paper[x-1][y] += 1;
				paper[x-1][y+1] += 1;
				paper[x][y-1] += 1;
				paper[x][y] += 1;
				paper[x][y+1] += 1;
				paper[x+1][y-1] += 1;
				paper[x+1][y] += 1;
				paper[x+1][y+1] += 1;
			} else if(s == 3){
				paper[x-2][y] += 1;
				paper[x-1][y-1] += 1;
				paper[x-1][y] += 1;
				paper[x-1][y+1] += 1;
				paper[x][y-2] += 1;
				paper[x][y-1] += 1;
				paper[x][y] += 1;
				paper[x][y+1] += 1;
				paper[x][y+2] += 1;
				paper[x+1][y-1] += 1;
				paper[x+1][y] += 1;
				paper[x+1][y+1] += 1;
				paper[x+2][y] += 1;
			}
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(paper[i][j] == 0){
					count++;
				}
				if(max < paper[i][j]){
					max = paper[i][j];
				}
			}
		}
		System.out.printf("%d\n", count);
		System.out.printf("%d\n", max);
	}
}