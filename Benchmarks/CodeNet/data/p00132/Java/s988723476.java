import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Jigsaw Puzzle
public class Main{

	static int H, W;
	static char[][] p;
	static int[][] sum;
	static int[] pieceSize;
	static int pieceN;
	static char[][][][] piece;
	static boolean[] used;
	static int[] order;

	static boolean dfs(int si, int sj, int num, int man){
		//		System.out.println("NUM: " + num);
		if(num==pieceN){
			for(int i=0;i<H;i++)for(int j=0;j<W;j++)if(p[i][j]=='.')return false;
			return true;
		}
		
		for(int i=si;i<H;i++){
			for(int j=sj;j<W;j++){
				//				if(p[i][j]=='.'){
//				for(int id=0;id<pieceN;id++){
//				while(!q.isEmpty()){
					int id = order[man];
//					System.out.println("POLL id:" + id);
					if(used[id])continue;
					for(int k=0;k<4;k++){
						boolean fit = true;
						int h = piece[id][k].length;
						int w = piece[id][k][0].length;
						if(i+h>=H||j+w>=W||sum[i+h+1][j+w+1]-sum[i+h+1][j]-sum[i][j+w+1]+sum[i][j]<pieceSize[id])continue;
						for(int di=0;di<h;di++){
							for(int dj=0;dj<w;dj++){
								if(p[i+di][j+dj]=='#'&&piece[id][k][di][dj]=='#'){
									fit = false;
									break;
								}
							}
							if(!fit)break;
						}
						if(fit){
							//								System.out.println("FIT! NUM:" + num + " PIECEID:" + id + " DIR:" + k + " AT:" + i + "," + j);
							for(int di=0;di<h;di++){
								for(int dj=0;dj<w;dj++){
									if(piece[id][k][di][dj]=='#')p[i+di][j+dj]='#';
								}
							}
							used[id] = true;
							if(dfs(0, 0, num+1,man+1)){
								for(int di=0;di<h;di++){
									for(int dj=0;dj<w;dj++){
										if(piece[id][k][di][dj]=='#')p[i+di][j+dj]='.';
									}
								}
								return true;
							}
							used[id] = false;
							for(int di=0;di<h;di++){
								for(int dj=0;dj<w;dj++){
									if(piece[id][k][di][dj]=='#')p[i+di][j+dj]='.';
								}
							}
						}
					}
//				}
				//				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			H = sc.nextInt();
			W = sc.nextInt();
			if((H|W)==0)break;
			p = new char[H][W];
			sum = new int[H+1][W+1];
			for(int i=0;i<H;i++)p[i]=sc.next().toCharArray();
			for(int i=1;i<=H;i++){
				for(int j=1;j<=W;j++){
					sum[i][j] = (p[i-1][j-1]=='.'?1:0) + sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1];
				}
			}
			//			for(int i=0;i<=H;i++){
			//				for(int j=0;j<=W;j++){
			//					System.out.print(sum[i][j]+" ");
			//				}
			//				System.out.println();
			//			}
			pieceN = sc.nextInt();
			pieceSize = new int[pieceN];
			piece = new char[pieceN][][][];
			for(int k=0;k<pieceN;k++){
				int h = sc.nextInt();
				int w = sc.nextInt();
				piece[k] = new char[4][h][w];
				int size = 0;
				for(int i=0;i<h;i++){
					char[] s = sc.next().toCharArray();
					for(int j=0;j<w;j++){
						piece[k][0][i][j]=s[j];
						if(s[j]=='#')size++;
					}
				}
				pieceSize[k] = size;
//				System.out.println("PIECE ID:" + k + " SIZE:" + size);
				for(int m=1;m<4;m++){
					int nh = piece[k][m-1][0].length;
					int nw = piece[k][m-1].length;
					piece[k][m] = new char[nh][nw];
					for(int i=0;i<nh;i++){
						for(int j=0;j<nw;j++){
							piece[k][m][i][j] = piece[k][m-1][j][nh-i-1];
						}
					}
					//					System.out.println("PIECE ID:" + k);
					//					for(int i=0;i<nh;i++)System.out.println(new String(piece[k][m][i]));
				}
			}
			int player = sc.nextInt();
			while(player--!=0){
				used = new boolean[pieceN];
				Arrays.fill(used, true);
				int k = sc.nextInt();
				order = new int[k];
				int size = 0;
				PriorityQueue<Integer> q = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return pieceSize[o2]-pieceSize[o1];
					}
				});
				for(int i=0;i<k;i++){
					int x = sc.nextInt()-1;
					used[x]=false;
					q.add(x);
					size += pieceSize[x];
				}
				for(int i=0;i<k;i++){
					order[i]=q.poll();
//					System.out.println("ORDER ID:" + i + " SIZE:" + pieceSize[i]);
				}
				if(size!=sum[H][W])System.out.println("NO");
				else System.out.println(dfs(0,0,pieceN-k,0)?"YES":"NO");
			}
		}
	}
}