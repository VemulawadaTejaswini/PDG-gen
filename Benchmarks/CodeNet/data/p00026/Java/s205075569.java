import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int blocks[][] = new int[10][10];
		int blank=0,max=0;

		while((str=br.readLine()) != null){
			String strArray[] = str.split(",");
			int x = Integer.parseInt(strArray[0]);
			int y = Integer.parseInt(strArray[1]);
			int size = Integer.parseInt(strArray[2]);

			drop(blocks, x, y, size);

		}

		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(blocks[i][j]==0){
					blank++;
				}else if(blocks[i][j]>max){
					max = blocks[i][j];
				}
			}
		}

		System.out.println(blank);
		System.out.println(max);

	}

	static void drop(int blocks[][],int x, int y, int size){
		if(size == 1)//小の滴
			min_drop(blocks, x, y);
		if(size == 2)
			mid_drop(blocks, x, y);
		if(size == 3)
			lag_drop(blocks, x, y);
	}

	static void min_drop(int blocks[][], int x, int y){
		blocks[x][y]++;
		blocks[x-1][y]++;
		blocks[x+1][y]++;
		blocks[x][y-1]++;
		blocks[x][y+1]++;
	}

	static void mid_drop(int blocks[][], int x, int y){
		min_drop(blocks, x, y);
		blocks[x-1][y-1]++;
		blocks[x+1][y-1]++;
		blocks[x-1][y+1]++;
		blocks[x+1][y+1]++;
	}

	static void lag_drop(int blocks[][], int x, int y){
		mid_drop(blocks, x, y);
		blocks[x][y-2]++;
		blocks[x][y+2]++;
		blocks[x-2][y]++;
		blocks[x+2][y]++;
	}
}