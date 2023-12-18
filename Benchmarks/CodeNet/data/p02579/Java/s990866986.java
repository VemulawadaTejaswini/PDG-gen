import java.util.*;
public class Main{
	static int h, w, Ch, Cw, Dh, Dw;
	static int ans = Integer.MAX_VALUE;

	static void dfs(int x, int y,String[] s,boolean[][] cheack, int count){
		for(int ix = -1;ix <= 1; ++ix){
			for(int jy = -1; jy <= 1; ++jy){
				if(0 <= x+ix && x+ix < w &&
				   0 <= y+jy && y+jy < h &&
				   (ix == 0 || jy == 0)  &&
				   (ix != 0 || jy != 0)&& !cheack[y+jy][x+ix]){
					   if(y+jy == Dh-1 && x+ix == Dw-1){
						   ans = Math.min(ans, count);
						   return;
					   }
					   else if(s[y+jy].charAt(x+ix) == '.' && !cheack[y+jy][x+ix]){
							cheack[y+jy][x+ix] = true;
							dfs(x+ix, y+jy,s, cheack, count);
							cheack[y+jy][x+ix] = false;
					   }
				   }
			}
		}

		for(int ix = -2;ix <= 2; ++ix){
			for(int jy = -2; jy <= 2; ++jy){
				if(0 <= x+ix && x+ix < w &&
				   0 <= y+jy && y+jy < h &&
				   (ix != 0 || jy != 0)&& !cheack[y+jy][x+ix]){
					if(y+jy == Dh-1 && x+ix == Dw-1){
						ans = Math.min(ans, count);
						return;
					}
					else if(s[y+jy].charAt(x+ix) == '.' && !cheack[y+jy][x+ix]){
						cheack[y+jy][x+ix] = true;
						dfs(x+ix, y+jy,s, cheack, count+1);
						cheack[y+jy][x+ix] = false;
				   }
				   }
			}
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		h = scan.nextInt();
		w = scan.nextInt();
		Ch = scan.nextInt();
		Cw = scan.nextInt();
		Dh = scan.nextInt();
		Dw = scan.nextInt();
		String[] S = new String[h];
		for(int i = 0;i < h; ++i){
			S[i] = scan.next();
		}
		boolean[][] cheack = new boolean[h][w];
		cheack[Ch-1][Cw-1] = true;
		dfs(Cw-1, Ch-1, S, cheack,0);
		System.out.print(ans == Integer.MAX_VALUE?-1:ans);
	}
}
