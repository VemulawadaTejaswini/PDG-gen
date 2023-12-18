import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int w, h, xs, ys, xg, yg, n;
    int c, d, x, y;

    int[][] block;
    boolean[][] route;
    boolean[][] visit;
    int[] dirX = {1, 0, -1, 0};
    int[] dirY = {0, 1, 0, -1};

    void run(){
	while(sc.hasNext()){
	    w = sc.nextInt()+1;
	    h = sc.nextInt()+1;
	    if(w==1 && h==1) break;
	    put();
	    makeRoute();
	    //show();

	    visit = new boolean[h][w];
	    if(!route[ys][xs] || !route[yg][xg]){
		System.out.println("NG");
		continue;
	    }
	    else System.out.println(search(xs, ys) ? "OK":"NG");
	}
    }

    /*
      マンハッタン距離が近くなるように道を選ぶ
      (マンハッタン短縮を見つけられなければ)行ける所に行く
      どこにも行けなければほげ。
    */
    boolean search(int x, int y){
	visit[y][x] = true;
	int d = getD(x, y);
	boolean[] goodRoute = new boolean[4];
	boolean[] canRoute = new boolean[4];
	int gc = 0;
	int cc = 0;
	if(d==0) return true;

	for(int i=0; i<dirX.length; i++){
	    int a = x+dirX[i];
	    int b = y+dirY[i];
	    if(a>0 && a<w && b>0 && b<h && route[b][a] && !visit[b][a]){
		canRoute[i] = true;
		cc++;
		if(getD(a, b)<d){
		    goodRoute[i] = true;
		    gc++;
		}
	    }
	}
	
	if(gc!=0){
	    for(int i=0; i<4; i++)
		if(goodRoute[i]) 
		    if(search(x+dirX[i], y+dirY[i])) return true;
	}
	else if(cc!=0){
	    for(int i=0; i<4; i++)
		if(canRoute[i]) 
		    if(search(x+dirX[i], y+dirY[i])) return true;
	}
		    
	return false;
    }

    int getD(int x, int y){ return Math.abs(xg-x) + Math.abs(yg-y); }

    void show(){
	for(int i=1; i<w; i++){
	    for(int k=1; k<h; k++)
		System.out.print(route[i][k] ? "□":"■");
	    System.out.println();
	}
	System.out.println("----------------");
    }

    void put(){
	xs = sc.nextInt();
	ys = sc.nextInt();
	xg = sc.nextInt();
	yg = sc.nextInt();
	n = sc.nextInt();

	block = new int[h][w];
	route = new boolean[h][w];

	for(int i=0; i<n; i++){
	    c = sc.nextInt();
	    d = sc.nextInt();
	    x = sc.nextInt();
	    y = sc.nextInt();
	    if(d==0)
		for(int a=x; a<x+4; a++)
		    for(int b=y; b<y+2; b++)
			block[b][a] = c;    
	    else
		for(int a=x; a<x+2; a++)
		    for(int b=y; b<y+4; b++)
			block[b][a] = c;
	}
    }

    void makeRoute(){
	int tcolor = block[ys][xs];
	for(int i=0; i<w; i++)
	    for(int k=0; k<h; k++)
		if(block[k][i]==tcolor) route[k][i] = true;
    }
}