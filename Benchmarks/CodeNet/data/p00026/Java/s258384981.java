import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	static int[][] map = new int[10][10];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] ink = null;
		String point;
		int count = 0;
		

		while((point = sc.next()) != null){
			ink = point.split(",",0);
			
			drowing(Integer.parseInt(ink[0]), 
					Integer.parseInt(ink[1]),
					Integer.parseInt(ink[2]));
		}

		Arrays.sort(map);
		
		for(int i = 0; i < 10; i++)
			for(int j = 0; j < 10; j++)
				if(map[i][j] == 0)count++;
		
		System.out.println(count);
		System.out.println(map[9][9]);
	}
	
	static void drowing(int x, int y, int z){
		try{
		if(z == 1){
			map[x][y]++;
			map[x-1][y]++;
			map[x+1][y]++;
			map[x][y-1]++;
			map[x][y+1]++;
		}else if(z == 2){
			map[x][y]++;
			map[x-1][y]++;
			map[x+1][y]++;
			map[x-1][y-1]++;
			map[x][y-1]++;
			map[x+1][y-1]++;
			map[x-1][y+1]++;
			map[x][y+1]++;
			map[x+1][y+1]++;
		}else if(z == 3){
			map[x][y]++;
			map[x][y-2]++;
			map[x-1][y-1]++;
			map[x][y-1]++;
			map[x+1][y-1]++;
			map[x-2][y]++;
			map[x-1][y]++;
			map[x+1][y]++;
			map[x+1][y]++;
			map[x-1][y+1]++;
			map[x][y+1]++;
			map[x+1][y+1]++;
			map[x][y+2]++;
		}}catch(Exception e){
		}
	}
}