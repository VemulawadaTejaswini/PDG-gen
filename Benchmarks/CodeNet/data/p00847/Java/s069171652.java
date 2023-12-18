import java.util.*;
import java.awt.geom.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1268();
	}
	class AOJ1268{
		AOJ1268(){
			while(sc.hasNext()){
				initEmpX = sc.nextInt();
				initEmpY = sc.nextInt();
				if((initEmpX|initEmpY)==0)	break;
				--initEmpX;
				--initEmpY;
				solve();
			}
		}
		int initEmpX,initEmpY;
		int[] target, vtd;
		final int MAX = Integer.parseInt("1000000000", 7);
		final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
		final int[][] dic = {{0,0,0,0}, {0,0,1,2}, {0,3,0,4}, {0,5,6,0}};
		void solve(){
			target = new int[9];
			for(int i=0; i<9; i++){
				String in=sc.next();
				int c=0;
				if(in.equals("W"))		c=1;
				else if(in.equals("B"))	c=2;
				else if(in.equals("R"))	c=3;
				target[i] = c;
			}
			
			int lower = -1, upper = 31, mid = 0;
			while(lower+1 < upper){
				mid = (lower+upper) / 2;
				int[] init = {1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3};
				init[(initEmpX+initEmpY*3)*2] = 0;
				init[(initEmpX+initEmpY*3)*2+1] = 0;
				if( DFS(init, 0, mid, initEmpX, initEmpY, -1))	upper = mid;
				else	lower = mid;
			}
			System.out.println( upper>30? -1 : upper);
		}
		
		boolean DFS(int[] dice, int depth, int lim, int ex, int ey, int lpos){
			int diff=0;
			for(int i=0; i<9; ++i)if( dice[i*2] != target[i] )	diff += 1;
			if(diff == 0)	return true;
			
			if(depth+diff-1 > lim)	return false;
			
			int epos = ex+ey*3;
			for(int v=0; v<4; ++v){
				int xx = ex+vx[v], yy = ey+vy[v];
				if( !(0<=xx && xx<3 && 0<=yy && yy<3) )	continue;
				int pos = xx+yy*3;
				if(pos == lpos)	continue;
				
				int top = dice[pos*2], front = dice[pos*2+1],
					newTop = 0, newFront = 0;
				if(vx[v] != 0){
					newTop = 6-(top+front);
					newFront = front;
				}else{
					newTop = front;
					newFront = top;
				}
				
				dice[pos*2] = 0;
				dice[pos*2+1] = 0;
				dice[epos*2] = newTop;
				dice[epos*2+1] = newFront;
				
				if( DFS(dice, depth+1, lim, xx, yy, epos) )	return true;
				
				dice[pos*2] = top;
				dice[pos*2+1] = front;
				dice[epos*2] = 0;
				dice[epos*2+1] = 0;
			}
			return false;
		}
		int getHash(int[] dice){
			StringBuilder tmp = new StringBuilder();
			for(int i=0; i<18; i+=2)	tmp.append(dic[dice[i]][dice[i+1]]);
			return Integer.parseInt(tmp.toString(), 7);
		}
	}
}