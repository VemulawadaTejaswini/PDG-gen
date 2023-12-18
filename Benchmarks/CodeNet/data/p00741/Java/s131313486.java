import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(true) {
			int W = s.nextInt();
			int H = s.nextInt();
			if(W == 0 && H == 0)
				break;
			
			int[][] c = new int[H + 2][W + 2];
			boolean[][] passed = new boolean[H+2][W+2];
			
			Stack<int[]> stack = new Stack<int[]>();
			
			int index = 1;
			for(int i = 1; i < H + 1; i++) {
				for(int j = 1; j < W + 1; j++) {
					c[i][j] = s.nextInt();
					if(c[i][j] == 1)
						stack.add(new int[]{i, j, index++}); // y, x
				}
			}
			
			// vx ,vy
			int[] vx = { 0,  1,  1,  1,  0, -1, -1, -1};
			int[] vy = {-1, -1,  0,  1,  1,  1,  0, -1};
			
			int[] tmp;
			int tmpx, tmpy;
			int result = 0;
			index = 0;
			while(!stack.isEmpty()) {
				tmp = stack.pop();
				
				if(index != tmp[2]) {
					if(passed[tmp[0]][tmp[1]]) {
						continue;
					}
					index = tmp[2];
					result++;
					
				}else {
					
				}

				passed[tmp[0]][tmp[1]] = true;
				
				
				for(int i = 0; i < 8; i++) {
					tmpy = tmp[0] + vy[i];
					tmpx = tmp[1] + vx[i];
					if(passed[tmpy][tmpx])
						continue;
					if(c[tmpy][tmpx] == 1) {
						passed[tmpy][tmpx] = true;
						stack.add(new int[] {tmpy, tmpx, tmp[2]});
					}
				}
			}
			System.out.println(result);
		}
    }
}
