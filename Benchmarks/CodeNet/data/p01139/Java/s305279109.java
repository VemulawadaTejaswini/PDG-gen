import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    char[][] map;
    int[][] round; // 0:未, 1:黒, 2:白, -1:黒でも白でもない -2:杭
    int w, h;
    int B, W;


    void run(){
	while(sc.hasNext()){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(w==0 && h==0) break;
	    
	    map = new char[h][w];
	    round = new int[h][w];
	    
	    for(int i=0; i<h; i++){
		String s = sc.next();
		for(int k=0; k<w; k++)
		    map[i] = s.toCharArray();
	    }
	    
	    for(int i=0; i<h; i++)
		for(int k=0; k<w; k++)
		    solve(0, 0, map[i][k]);
	    
	    count();
	    //show();
	    System.out.println(B+" "+W);
	}
    }

    void solve(int a, int b, char c){
	if(a<0 || a>=h || b<0 || b>=w) return;
	if(round[a][b]==-1 || round[a][b]==-2 || c=='.') return;
	
	if(map[a][b]=='B' || map[a][b]=='W'){
	    c = map[a][b];
	    round[a][b] = -2;
	    solve(a+1, b, c);
	    solve(a-1, b, c);
	    solve(a, b+1, c);
	    solve(a, b-1, c);
	}
	else if(round[a][b]==0){
	    round[a][b] = c=='B' ? 1 : 2;
	    solve(a+1, b, c);
	    solve(a-1, b, c);
	    solve(a, b+1, c);
	    solve(a, b-1, c);
	}
	else if( (round[a][b]==1 && c=='W') || (round[a][b]==2 && c=='B')){
	    round[a][b] = -1;
	    solve(a+1, b, c);
	    solve(a-1, b, c);
	    solve(a, b+1, c);
	    solve(a, b-1, c);
	}
    }

    void count(){
	B = 0;
	W = 0;
	for(int i=0; i<h; i++)
	    for(int k=0; k<w; k++)
		if(round[i][k]==1) B++;
		else if(round[i][k]==2) W++;
    }

    void show(){
	for(int i=0; i<h; i++){
	    for(int k=0; k<w; k++)
		System.out.print(round[i][k]+" ");
	    System.out.println();
	}
    }
}