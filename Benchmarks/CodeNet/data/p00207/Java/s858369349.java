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
    int[] dirX = {1, 1, 0, -1, -1, -1, 0, 1};
    int[] dirY = {0, -1, -1, -1, 0, 1, 1, 1};

    void run(){
	while(sc.hasNext()){
	    w = sc.nextInt()+1;
	    h = sc.nextInt()+1;
	    if(w==0 && h==0) break;
	    put();

	    if(block[xs][ys]!=block[xg][yg]){
		System.out.println("NG");
		break;
	    }
	    
	    int rc = block[xs][ys];
	    for(int i=1; i<w; i++)
		for(int k=1; k<h; k++)
		    if(block[i][k]==rc) route[i][k] = true;
	
	    System.out.println(search(xs, ys) ? "OK":"NG");
	}
    }

    boolean search(int x, int y){
	int dx = Math.abs(xg-x);
	int dy = Math.abs(yg-y);

	if(x==xg && y==yg)
	    return true;
	
	for(int i=0; i<dirX.length; i++){
	    int a = x+dirX[i];
	    int b = y+dirY[i];
	    if(a>0 && a<h && b>0 && b<w){
		int ndx = Math.abs(xg-a);
		int ndy = Math.abs(yg-b);
		if(route[a][b] && (dx>ndx || dy>ndy)){
		    if(search(a, b))
			return true;
		}
	    }
	}
	return false;
    }

    void show(){
	for(int i=1; i<w; i++){
	    for(int k=1; k<h; k++)
		System.out.print(block[i][k]+" ");
	    System.out.println();
	}
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