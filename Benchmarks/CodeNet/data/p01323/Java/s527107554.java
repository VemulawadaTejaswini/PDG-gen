import java.util.*;

public class Main {
	char[][] map;
	boolean[][] visit;
	int cnt;
	boolean flag;
	
	void drop(){
		for(int i=0;i<6;i++){
			char[] temp = new char[12];
			Arrays.fill(temp, '.');
			int k = 0;
			for(int j=0;j<12;j++){
				if(map[j][i]!='.'){
					temp[k] = map[j][i];
					k++;
				}
			}
			for(int j=0;j<12;j++) map[j][i] = temp[j];
		}
	}
	
	void func(){
		LinkedList<Integer> x = new LinkedList<Integer>();
		LinkedList<Integer> y = new LinkedList<Integer>();
		LinkedList<Integer> sx = new LinkedList<Integer>();
		LinkedList<Integer> sy = new LinkedList<Integer>();		
		int cnt, p, q;
		
		for(int z=0;;z++){
			flag = false;
			visit = new boolean[12][6];
			for(int i=0;i<12;i++){
				for(int j=0;j<6;j++){
					if(map[i][j]=='R' || map[i][j]=='G' || map[i][j]=='B' || map[i][j]=='Y' || map[i][j]=='P'){
						
						x.offer(j);
						y.offer(i);
						cnt = 0;
						while(x.size()!=0){
							p = x.poll();
							q = y.poll();
							sx.offer(p);
							sy.offer(q);
							visit[q][p] = true;
							cnt++;
							
							if(p-1>=0 && visit[q][p-1]==false && map[q][p-1]==map[i][j]){
								x.offer(p-1);
								y.offer(q);
							}
							if(p+1<6 && visit[q][p+1]==false && map[q][p+1]==map[i][j]){
								x.offer(p+1);
								y.offer(q);
							}
							if(q-1>=0 && visit[q-1][p]==false && map[q-1][p]==map[i][j]){
								x.offer(p);
								y.offer(q-1);
							}
							if(q+1<12 && visit[q+1][p]==false && map[q+1][p]==map[i][j]){
								x.offer(p);
								y.offer(q+1);
							}
						}
						if(cnt>=4){
							flag = true;
							while(sx.size()!=0){
								p = sx.poll();
								q = sy.poll();
								map[q][p] = '.';
								if(p-1>=0 && map[q][p-1]=='O') map[q][p-1] = '.';
								if(p+1<6 && map[q][p+1]=='O') map[q][p+1] = '.';
								if(q-1>=0 && map[q-1][p]=='O') map[q-1][p] = '.';
								if(q+1<12 && map[q+1][p]=='O') map[q+1][p] = '.';
							}
						}else{
							sx.clear();
							sy.clear();
						}
						
					}
				}
			}
			if(flag==false){
				System.out.println(z);
				break;
			}else{
				drop();
			}
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=0;t<T;t++){
			map = new char[12][6];
			for(int i=11;i>=0;i--) map[i] = sc.next().toCharArray();
			func();
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}