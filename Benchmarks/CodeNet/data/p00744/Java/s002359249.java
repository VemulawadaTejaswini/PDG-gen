import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] blue, red;
    boolean[] usedB;
    boolean[] usedR;
    int m, n, pair;
    boolean[] prime;
    int[][] canPair;

    void run(){
	setP();
	while(true){
	    m = sc.nextInt();
	    n = sc.nextInt();
	    if(m==0 && n==0) break;

	    input();
	    for(int i=0; i<m; i++)
		for(int k=0; k<n; k++){
		    pair = Math.max(solve(i, k), pair);
		    //System.out.println("------");
		}
	    System.out.println(pair);
	}
    }

    void input(){
	blue = new int[m];
	red = new int[n];
	for(int i=0; i<m; i++)
	    blue[i] = sc.nextInt();
	Arrays.sort(blue);
	for(int i=0; i<n; i++)
	    red[i] = sc.nextInt();
	Arrays.sort(red);
	pair = 0;
	canPair = new int[m][n];
    }

    int solve(int sB, int sR){
	int tmp = 0;
	usedB = new boolean[m];
	usedR = new boolean[n];
	int i = sB+1==m ? 0:sB+1;
	boolean visitB = false;
	for(; !visitB; i++){
	    if(i==sB) visitB = true;
	    int a = blue[i];

	    int k = sR+1==n ? 0:sR+1;
	    boolean visitR = false;
	    for(; !visitR; k++){
		if(k==sR) visitR = true;
		int b = red[k];
		if(canPair[i][k]==-1 || usedR[k] || usedB[i] ||
		   Math.abs(a-b)==1 || isCont(a, b)){
		    if(k+1==n) k = -1;
		    continue;
		}
		if(canPair[i][k]==1 || div(i, k)){
		    tmp++;
		    usedR[k] = true;
		    usedB[i] = true;
		    //System.out.println(a+" "+b);
		    break;
		}
		if(k+1==n) k = -1;
	    }
	    if(i+1==m) i = -1;
	}
	return tmp;
    }

    boolean isCont(int a, int b){
	if(a==b) return false;
	if(prime[a] && prime[b])
	    return a==b ? false : true;
	int d = Math.abs(a-b);
	if(prime[d] && a%d==0) return false;
	if(!prime[d]) return false;
	return true;
    }

    boolean div(int i, int k){
	int b = blue[i];
	int r = red[k];
	int max = Math.max(b, r);
	int d = max;
	while(d!=b*r){
	    if(d%b==0 && d%r==0) {
		canPair[i][k] = 1;
		int x = i+1;
		while(x<blue.length && blue[x]==blue[i]){
		    canPair[x][k] = 1;
		    x++;
		}
		/*
		x = i-1;	
		while(x>=0 && blue[x]==blue[i]){
		    canPair[x][k] = 1;
		    x--;
		}
		*/
		int y = k+1;
		while(y<red.length && red[y]==red[k]){
		    canPair[i][y] = 1;
		    y++;
		}
		/*
		y = k-1;
		while(y>=0 && red[y]==red[k]){
		    canPair[i][y] = 1;
		    y--;
		}
		*/
		return true;
	    }
	    d += max;
	}
	canPair[i][k] = -1;
	return false;
    }

    void setP(){
	prime = new boolean[10000000];
	Arrays.fill(prime, true);
	prime[0] = prime[1] = false;
	for(int i=2; i<prime.length; i++)
	    if(prime[i])
		for(int k=i*2; k<prime.length; k+=i)
		    prime[k] = false;
    }
}