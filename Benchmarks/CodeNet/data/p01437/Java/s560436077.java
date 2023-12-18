import java.util.LinkedList;
import java.util.Scanner;
 
 
public class Main{
     
	public static final int DIRS = 4;
	
	public static final int NORTH = 0;
	public static final int EAST  = 1;
	public static final int SOUTH = 2;
	public static final int WEST  = 3;
	public static final String[] dir_str = new String[]{"N", "E", "S", "W"};
	
	public static final int[] vx = new int[]{0, 1, 0, -1};
	public static final int[] vy = new int[]{-1, 0, 1, 0};
	
	
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		final int H = sc.nextInt();
    		final int W = sc.nextInt();
    		final int L = sc.nextInt();
    		
    		if(H == 0 && W == 0 && L == 0){
    			break;
    		}
    		
    		int sx = -1;
    		int sy = -1;
    		int sdir = -1;
    		boolean[][] is_wall = new boolean[H][W];
    		for(int i = 0; i < H; i++){
    			char[] inputs = sc.next().toCharArray();
    			
    			for(int j = 0; j < W; j++){
    				if(inputs[j] == '#'){
    					is_wall[i][j] = true;
    				}else if(inputs[j] == 'N'){
    					sx = j;
    					sy = i;
    					sdir = NORTH;
    				}else if(inputs[j] == 'E'){
    					sx = j;
    					sy = i;
    					sdir = EAST;
    				}else if(inputs[j] == 'S'){
    					sx = j;
    					sy = i;
    					sdir = SOUTH;
    				}else if(inputs[j] == 'W'){
    					sx = j;
    					sy = i;
    					sdir = WEST;
    				}
    			}
    		}
    		
    		long[][][] visit_time = new long[H][W][DIRS];
    		for(int i = 0; i < H; i++){
    			for(int j = 0; j < W; j++){
    				for(int k = 0; k < DIRS; k++){
    					visit_time[i][j][k] = -1;
    				}
    			}
    		}
    		int x = sx;
    		int y = sy;
    		int dir = sdir;
    		long time = 0;
    		
    		while(time < L){
    			//System.out.println(x + " " + y + " " + dir + " " + time);
    			
    			if(visit_time[y][x][dir] >= 0){
    				final long diff_time = time - visit_time[y][x][dir];
    				time += ((L - time) / diff_time) * diff_time;
    				
    				if(time >= L){
    					break;
    				}
    				
    				for(int i = 0; i < H; i++){
    	    			for(int j = 0; j < W; j++){
    	    				for(int k = 0; k < DIRS; k++){
    	    					visit_time[i][j][k] = -1;
    	    				}
    	    			}
    	    		}
    			}
    			
    			visit_time[y][x][dir] = time;
    			
    			for(int offset = 0; offset < DIRS; offset++){
    				final int ndir = (dir + offset) % 4;
    				final int nx = x + vx[ndir];
    				final int ny = y + vy[ndir];
    				
    				if(nx < 0 || nx >= W || ny < 0 || ny >= H){
    					continue;
    				}if(is_wall[ny][nx]){
    					continue;
    				}else{
    					x = nx;
    					y = ny;
    					dir = ndir;
    					time++;
    					
    					
    					
    					break;
    				}
    			}
    		}
    		//System.out.println(time);
    		System.out.println((y + 1) + " " + (x + 1) + " " + dir_str[dir]);
    		
    	}
    }
     
}