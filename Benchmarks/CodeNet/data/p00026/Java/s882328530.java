import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[14][14];
		int count = 0,max = 0;
		
		while(sc.hasNext()){
			
			int[] x = new int[3];
			
			String[] code = sc.next().split(",",0);
			
			for(int i = 0; i < code.length; i++)
				x[i] = Integer.parseInt(code[i]);
			
			if(x[2] >= 1){
				map[x[0]][x[1]]++;
				map[x[0]][x[1]-1]++;
				map[x[0]][x[1]+1]++;
				map[x[0]-1][x[1]]++;
				map[x[0]+1][x[1]]++;
				}
			if(x[2] >= 2){
				map[x[0]-1][x[1]-1]++;
				map[x[0]+1][x[1]-1]++;
				map[x[0]-1][x[1]+1]++;
				map[x[0]+1][x[1]+1]++;
			}
			if(x[2] == 3){
				map[x[0]][x[1]-2]++;
				map[x[0]][x[1]+2]++;
				map[x[0]+2][x[1]]++;
				map[x[0]-2][x[1]]++;
			}
		}
		for(int i = 2; i < 14; i++){
			for(int j = 2; j < 14; j++){
				if(map[i][j] > 0)count++;
				if(max < map[i][j])max = map[i][j];
			}
		}
		System.out.println(100 - count);
		System.out.println(max);
		
		sc.close();
	}
}