

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static final void main(String[] args) {
		new Main();
	}

	int w;
	int h;
	char[][] map = new char[2][100*100];
	int sl;
	int sr;
	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0)
				break;
			for(int i=0;i<h;i++){
				String s0 = sc.next();
				String s1 = sc.next();
				for(int j=0;j<w;j++){
					map[0][i*w+j] = s0.charAt(j);
					map[1][i*w+j] = s1.charAt(w-j-1);
					if(map[0][i*w+j]=='L')
						sl = i*w+j;
					if(map[1][i*w+j]=='R')
						sr = i*w+j;
					
				}
			}
			solve();
			System.gc();
		}
	}

	int[] dx = new int[]{-1, 0, 1, 0};
	int[] dy = new int[]{0, -1, 0, 1};
	private void solve() {
		LinkedList<int[]> queue = new LinkedList<int[]>();
		
		int[][] visited = new int[w*h][w*h];
		queue.add(new int[]{sl, sr});

		while(!queue.isEmpty()){
			int[] cp = queue.poll();
			int clp = cp[0];
			int crp = cp[1];
			
			if(visited[clp][crp]==1)
				continue;
			
			visited[clp][crp] = 1;
			for(int i=0;i<4;i++){
				int nlpx = clp%w +dx[i];
				int nlpy = clp/w +dy[i];
				int nrpx = crp%w +dx[i];
				int nrpy = crp/w +dy[i];
				
				if(nlpx<0 || w<=nlpx) nlpx = clp%w;
				if(nlpy<0 || h<=nlpy) nlpy = clp/w;
				if(nrpx<0 || w<=nrpx) nrpx = crp%w;
				if(nrpy<0 || h<=nrpy) nrpy = crp/w;
				
				int nlp = nlpx + nlpy*w;
				int nrp = nrpx + nrpy*w;
				if((nlp<0 || w*h<=nlp) && (nrp<0 || w*h<=nrp))
					continue;
				else if(nlp<0 || w*h<=nlp)
					nlp = clp;
				else if(nrp<0 || w*h<=nrp)
					nrp = crp;
				
				if(map[0][nlp]=='#' && map[1][nrp]=='#')
					continue;
				if(map[0][nlp]=='#')
					nlp = clp;
				if(map[1][nrp]=='#')
					nrp = crp;
				
				if(map[0][nlp]=='%' && map[1][nrp]=='%'){
					System.out.println("Yes");
					queue.clear();
					return;
				}else if(map[0][nlp]=='%' || map[1][nrp]=='%'){
					continue;
				}
if(visited[nlp][nrp]!=0)
				queue.add(new int[]{nlp, nrp});
			}
		}
		
		System.out.println("No");
	}
}