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

	    if(block[xs][ys]==0 || block[xs][ys]!=block[xg][yg]){
		System.out.println("NG");
		continue;
	    }

	    int rc = block[xs][ys];
	    for(int i=1; i<w; i++)
		for(int k=1; k<h; k++)
		    if(block[i][k]==rc) route[i][k] = true;
	    System.out.println(search(xs, ys, route) ? "OK":"NG");
	}
    }

    boolean search(int x, int y, boolean[][] r){
	//show();
	if(x==xg && y==yg)
	    return true;
	
	for(int i=0; i<dirX.length; i++){
	    int a = x+dirX[i];
	    int b = y+dirY[i];
	    if(a>0 && a<h && b>0 && b<w){
		if(r[a][b]){
		    r[x][y] = false;
		    if(search(a, b, r))
			return true;
		    r[x][y] = true;
		}
	    }
	}
	return false;
    }

    void show(){
	for(int i=1; i<w; i++){
	    for(int k=1; k<h; k++)
		System.out.print(route[i][k] ? "o":"x");
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

	block = new int[w][h];
	route = new boolean[w][h];

	for(int i=0; i<n; i++){
	    c = sc.nextInt();
	    d = sc.nextInt();
	    x = sc.nextInt();
	    y = sc.nextInt();

	    if(d==0)
		for(int a=x; a<x+4; a++)
		    for(int b=y; b<y+2; b++)
			block[a][b] = c;
	    
	    else
		for(int a=x; a<x+2; a++)
		    for(int b=y; b<y+4; b++)
			block[a][b] = c;
	}
    }
}