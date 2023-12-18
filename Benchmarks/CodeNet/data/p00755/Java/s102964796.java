import java.util.Scanner;


public class Main {
	
	private static void copy(int w, int h, int[][] map, int[][] new_map){
		for(int m = 0; m < h; m++){
			for(int n = 0; n < w; n++){
				new_map[m][n] = map[m][n];
			}
		}
	}
	
	private static int count(int x, int y, int[][] map, boolean[][] visited){
		int counter = 0;
		if(!visited[y][x]){
			counter++;
			visited[y][x] = true;
		}else{
			return 0;
		}
		
		if(x != 0 && map[y][x] == map[y][x-1]){
			counter += count(x-1,y,map, visited);
		}
		
		if(x != map[0].length-1 && map[y][x] == map[y][x+1]){
			counter += count(x+1,y,map, visited);
		}
		
		if(y != 0 && map[y][x] == map[y-1][x]){
			counter += count(x,y-1,map, visited);
		}
		
		if(y != map.length-1 && map[y][x] == map[y+1][x]){
			counter += count(x,y+1,map, visited);
		}
		
		return counter;
	}
	
	private static void change(int x, int y, int[][] old_map, int[][] new_map, int color, boolean[][] visited){
		if(!visited[y][x]){
			new_map[y][x] = color;
			visited[y][x] = true;
		}else{
			return;
		}
		
		if(x != 0 && old_map[y][x] == old_map[y][x-1]){
			change(x-1,y,old_map,new_map,color,visited);
		}
		
		if(x != old_map[0].length-1 && old_map[y][x] == old_map[y][x+1]){
			change(x+1,y,old_map,new_map,color,visited);
		}
		
		if(y != 0 && old_map[y][x] == old_map[y-1][x]){
			change(x,y-1,old_map,new_map,color,visited);
		}
		
		if(y != old_map.length-1 && old_map[y][x] == old_map[y+1][x]){
			change(x,y+1,old_map,new_map,color,visited);
		}
	}
	
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int color = sc.nextInt();
			
			if(h == 0 && w == 0 && color == 0){
				break;
			}
			
			int[][] map = new int[h][w];
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			int[][] first = new int[h][w];
			int[][] second = new int[h][w];
			int[][] third = new int[h][w];
			int[][] forth = new int[h][w];
			int[][] last = new int[h][w];
			
			int max = -1;
			
			for(int i = 1; i <= 6 ; i++){
				copy(w,h,map, first);
				change(0,0,map,first,i,new boolean[h][w]);
				for(int j = 1; j <= 6; j++){
					copy(w,h,first, second);
					change(0,0,first,second,j,new boolean[h][w]);
					for(int k = 1; k <= 6; k++){
						copy(w,h,second, third);
						change(0,0,second,third,k,new boolean[h][w]);
						for(int l = 1; l <= 6; l++){
							copy(w,h,third, forth);
							change(0,0,third,forth,l,new boolean[h][w]);
							
							copy(w,h,forth, last);
							change(0,0,forth,last,color,new boolean[h][w]);
							/*
							for(int m = 0; m < h; m++){
								for(int n = 0; n < w; n++){
									System.out.print(last[m][n] + " ");
								}
								System.out.println();
							}
							System.out.println();
							*/
							int c = count(0,0,last, new boolean[h][w]);
							if(max < c){
								max = c;
							}
						}		
					}
				}
			}
			
			System.out.println(max);
		}
		
	}
}	