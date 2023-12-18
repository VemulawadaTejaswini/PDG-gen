import java.util.*;
import java.io.*;

public class Main{


	int w, h; //yoko tate
	String[] board;

	int kx,ky;
	int mx,my;

	void solve(){

		Scanner cin = new Scanner(System.in);
		while(true)
		{
			w = cin.nextInt();
			h = cin.nextInt();
			if(w==0 && h==0) return;
			board = new String[h];
			for(int i=0;i<h;i++) board[i] = cin.next();
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(board[i].charAt(j)=='K'){
						ky = i;
						kx = j;
					}
					else if(board[i].charAt(j)=='M'){
						my = i;
						mx = j;
					}
				}
			}
			int ret = bfs(ky,kx,my,mx);
			if(ret == 0){
				System.out.println("He cannot bring tea to his master.");
			}
			else if(ret == 1){
				System.out.println("He cannot return to the kitchen.");
			}
			else{
				System.out.println("He can accomplish his mission.");
			}
		}
	}

	boolean[][][][][][] dp;
	int[] vy = new int[]{1,0,-1,0};
	int[] vx = new int[]{0,1,0,-1};

	int[] next = new int[]{1,3}; //1(left) and -1(right)

	int bfs(int sy, int sx, int gy, int gx){
		dp = new boolean[h][w][h][w][4][4];
		Queue<Integer> q = new LinkedList<Integer>();
		int sk = 0;
		int gk = 0;

		for(int k=0;k<4;k++){
			if(board[sy+vy[k]].charAt(sx+vx[k])!='#') sk = k;
			if(board[gy+vy[k]].charAt(gx+vx[k])!='#') gk = k;
		}
		for(int k2=0;k2<4;k2++){
			q.add(encode(sy,sx,sy,sx,sk,k2));
			dp[sy][sx][sy][sx][sk][k2] = true;
		}

		int ret = 0;
		while(!q.isEmpty()){
			int[] now = decode(q.poll());
			int y1 = now[0];
			int x1 = now[1];
			int y2 = now[2];
			int x2 = now[3];
			int k = now[4];
			int k2 = now[5];
			//if(x1!=5 && x2!=5 && x2!=0) System.out.println(y1 + " " + x1 + " " + y2 + " " + x2 + " " + k);
			while(board[y1 + vy[k]].charAt(x1 + vx[k]) != '#'){
				y1 += vy[k];
				x1 += vx[k];
			}
			if(true){
				if(y1==gy && x1 == gx){
					ret = 1;
				}
				for(int vk : next){
					int nk = (k + vk) % 4;
					int nk2 = (k2+vk)%4;
					if(!dp[y1][x1][0][0][nk][nk2]){
						q.add(encode(y1,x1,0,0,nk,nk2));
						dp[y1][x1][0][0][nk][nk2] = true;
					}
				}
			}
			if(y2!=0){
				do{
					for(int vk : next){
						int nk = (k + vk) % 4;
						int nk2 = (k2 + vk)%4;
						if(board[y2+vy[(nk2+2)%4]].charAt(x2+vx[(nk2+2)%4])!='#') continue;

						if(y1==gy && x1==gx){
							if(y2==gy && x2==gx){
								if(k2==(gk+2)%4)return 2;
							}
							ret = 1;
						}
						if(!dp[y1][x1][y2][x2][nk][nk2]){
							q.add(encode(y1,x1,y2,x2,nk,nk2));
							dp[y1][x1][y2][x2][nk][nk2] = true;
						}
					}
					y2 += vy[k2];
					x2 += vx[k2];
				}while(board[y2].charAt(x2) != '#');
			}
		}
		return ret;
	}

	int encode(int y1, int x1, int y2, int x2, int k, int k2){
		int ret = 0;
		ret += y1;
		ret *= w;
		ret += x1;
		ret *= h;
		ret += y2;
		ret *= w;
		ret += x2;
		ret *= 4;
		ret += k;
		ret *= 4;
		ret += k2;
		return ret;
	}

	int[] decode(int hash){
		int[] ret = new int[6];
		ret[5] = hash % 4;
		hash /= 4;
		ret[4] = hash % 4;
		hash /= 4;
		ret[3] = hash % w;
		hash /= w;
		ret[2] = hash % h;
		hash /= h;
		ret[1] = hash % w;
		hash /= w;
		ret[0] = hash;
		return ret;
	}



	public static void main(String[] args){
		new Main().solve();
	}
}