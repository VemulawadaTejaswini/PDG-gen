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

	    if(!route[ys][xs] || !route[yg][xg]){
		System.out.println("NG");
		continue;
	    }
	    else System.out.println(search(xs, ys) ? "OK":"NG");
	}
    }

    /*
      マンハッタン距離が近くなるように道を選ぶ
      選べなければ行ける所に行く
      どこにも行けなければほげ。
    */
    boolean search(int x, int y){
	int d = getD(x, y);

	if(d==0) return true;

	for(int i=0; i<dirX.length; i++){
	    int a = x+dirX[i];
	    int b = y+dirY[i];
	    if(a>0 && a<h && b>0 && b<w){
		if(route[b][a] && getD(a, b)<d){
		    if(search(a, b)) return true;
		}
	    }
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