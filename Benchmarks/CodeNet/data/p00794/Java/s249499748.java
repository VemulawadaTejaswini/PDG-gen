import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.Object;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new aoj1237().doIt();
    }
    class aoj1237{	
    	int  W = 0,H = 0;
    	int map[][] = new int[8][8];
    	int hpm[][] = new int[8][8];
    	int deepm[][] = new int[8][8];
    	int result = 10000;
    	int mx[] = {0,1,0,-1};
    	int my[] = {1,0,-1,0};
    	int gx = 0,gy = 0;
    	void dfs(int x,int y,int hp,int deep){
//    		System.out.println(x+" "+y+" "+deep+" "+hp);
    		hpm[y][x] = hp;
    		deepm[y][x]= deep;
    		if(map[y][x] == 3){
    			result = Math.min(result, deep);
    		}else if(hp > 1){
    			for(int i = 0;i < 4;i++){
    				if(mx[i] + x >= 0 && mx[i] + x < W &&
    						my[i] + y >= 0 && my[i] + y < H){
    					if(hpm[my[i]+y][mx[i]+x] > hp && deepm[my[i]+y][mx[i]+x] < deep)continue;
    					if(map[my[i]+y][mx[i]+x] == 1)dfs(mx[i]+x,my[i]+y,hp-1,deep+1);
    					else if(map[my[i]+y][mx[i]+x] == 3)dfs(mx[i]+x,my[i]+y,hp-1,deep+1);
    					else if(map[my[i]+y][mx[i]+x] == 4){
    						map[my[i]+y][mx[i]+x] = 1;
    						dfs(mx[i]+x,my[i]+y,6,deep+1);
    						map[my[i]+y][mx[i]+x] = 4;
    					}
    				}
    			}
    		}
    	}
    	void check(){
    		for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++){
					System.out.print(hpm[i][j]+" ");
				}
				System.out.println();
    		}
    	}
    	void doIt(){
    		while(true){
    			W = sc.nextInt();
    			H = sc.nextInt();
    			int x = 0,y = 0;
    			if(W + H == 0)break;
    			for(int i = 0;i < H;i++){
    				for(int j = 0;j < W;j++){
    					map[i][j] = sc.nextInt();
    					hpm[i][j] = 0;
    					deepm[i][j] = 10000;
    					if(map[i][j] == 2){
    						x = j;y = i;
    					}else if(map[i][j] == 3){
    						gx = j;gy = i;
    					}
//    					System.out.print(map[i][j]);
    				}
//    				System.out.println();
    			}
    			result = 10000;
    			int ok = 10000;
    			dfs(x,y,6,0);
//    			check();
    			if(result == 10000)System.out.println(-1);
    			else System.out.println(result);
    		}
    	}
    }
}