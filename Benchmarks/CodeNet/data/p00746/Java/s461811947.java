import java.util.*;

class Main{
    int N;
    int[] n,d;
    int[][] map;
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    N = sc.nextInt();
	    if(N==0) break;
	    map = new int[402][402];
	    for(int i=0; i<402; i++) Arrays.fill(map[i],-1);
	    map[200][200] = 0;
	    n = new int[N];
	    d = new int[N];
	    for(int i=1; i<N; i++){
		n[i] = sc.nextInt();
		d[i] = sc.nextInt();
	    }

	    rec(200,200,0);

	    int w = 1;
	    int h = 1;
	    int firstH = -1; 
	    int lastH = -1;
	    for(int i=0; i<402; i++){
		int firstW = -1;
		int lastW = -1;
		for(int j=0; j<402; j++){
		    if(map[i][j]!=-1 && firstH==-1) firstH = i;
		    if(map[i][j]!=-1 && firstW==-1) firstW = j;
		    if(map[i][j]!=-1){lastW = j; lastH = i;}
		}
		w = Math.max(w,lastW-firstW+1);
	    }
	    h = lastH-firstH+1;

	    System.out.println(w+" "+h);
	}
    }

    void rec(int x, int y, int num){
	for(int i=1; i<N; i++){
	    if(n[i]==num){
		map[y+dy[d[i]]][x+dx[d[i]]] = i;
		rec(x+dx[d[i]],y+dy[d[i]],i);
	    }
	}
    }


    public static void main(String[] args){
	new Main().solve();
    }
}