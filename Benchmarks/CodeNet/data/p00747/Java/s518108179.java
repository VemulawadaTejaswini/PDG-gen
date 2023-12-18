import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new B().doIt();
    }
    class B{
    	int[][]map;
    	boolean[][]xmap;
    	boolean[][]ymap;
    	int w,h;
    	void dfs(int x,int y,int cnt){
    		map[y][x] = cnt;
//    		System.out.println(map[y][x]);
//    		System.out.println(y+" "+x);
    		if(x > 0){
    			if(xmap[y][x-1] && map[y][x-1] > cnt)dfs(x-1,y,cnt+1);
    		}
    		if(x < w - 1){
    			if(xmap[y][x] && map[y][x+1] > cnt)dfs(x+1,y,cnt+1);
    		}
    		if(y > 0){
    			if(ymap[y-1][x] && map[y-1][x] > cnt)dfs(x,y-1,cnt+1);
    		}
    		if(y < h - 1){
    			if(ymap[y][x] && map[y+1][x] > cnt)dfs(x,y+1,cnt+1);
    		}
    	}
        void doIt(){
        	while(true){
        		w = sc.nextInt();
        		h = sc.nextInt();
        		if(w + h == 0)break;
        		map = new int[h][w];
        		xmap = new boolean[h][w-1];
        		ymap = new boolean[h-1][w];
        		for(int i = 0;i < h;i++){
        			for(int j = 0;j < w;j++){
        				map[i][j] = Integer.MAX_VALUE;
        			}
        		}
        		map[0][0] = 1;
        		for(int i = 0;i < h;i++){
        			for(int j = 0;j < w-1;j++){
        				xmap[i][j] = (sc.nextInt() == 1 ? false : true);
        			}
        			if(i == h - 1)break;
        			for(int j = 0;j < w;j++){
        				ymap[i][j] = (sc.nextInt() == 1 ? false : true);
        			}
        		}
        		dfs(0,0,1);
        		if(map[h-1][w-1] > 10000)System.out.println(0);
        		else System.out.println(map[h-1][w-1]);
//        		check();
        	}
     	}
        void check(){
        	for(int i = 0;i < h;i++){
        		for(int j = 0;j < w-1;j++){
        			System.out.print((xmap[i][j] == true ? 1 : 0)+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        	for(int i = 0;i < h-1;i++){
        		for(int j = 0;j < w;j++){
        			System.out.print((ymap[i][j] == true ? 1 : 0)+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        	for(int i = 0;i < h;i++){
        		for(int j = 0;j < w;j++){
        			System.out.print(map[i][j]+" ");
        		}
        		System.out.println();
        	}
        }
    }
}