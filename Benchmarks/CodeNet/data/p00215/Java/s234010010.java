import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
 
    int x, y;
    int[][] encX;
    int[][] encY;
    int[][] dp;
    int[] pachi;
    int sx, sy, gx, gy;
    int ans, num;
    int MAX = Integer.MAX_VALUE;
    String s;
 
    void run(){
	while(sc.hasNext()){
	    x = sc.nextInt();
	    y = sc.nextInt();
	    if(x==0 && y==0) break;
	    input();

	    for(int i=0; i<5; i++){
		dp = new int[5][1000];
		for(int k=0; k<5; k++)
		    Arrays.fill(dp[k], MAX);

		int from = (i+1)%5;
		int to = (from+1)%5;

		for(int k=0; k<pachi[from]; k++){
		    dp[from][k] = Math.abs(sy-encY[from][k])+Math.abs(sx-encX[from][k]);
		    //System.out.println(dp[from][k]);
		}
		
	
		for(int k=0; k<4; k++){
		    from = (i+k+1)%5;
		    to = (i+k+2)%5;
		    search(from, to);  
		}

		int end = (i+4)%5; 
		for(int k=0; k<pachi[end]; k++){
		    int tmp = dp[end][k]+Math.abs(encX[end][k]-gx)+Math.abs(encY[end][k]-gy);
		    //System.out.println("*"+(i+1)+" "+dp[end][k]+" "+tmp);
		    if(ans > tmp){
			ans = tmp;
			num = i+1;
		    }
		}
	    }
         
	    System.out.println(num!=-1 ?
			       (num+" "+ans) : "NA");
	}
    }
 
    void search(int from, int to){

	for(int i=0; i<pachi[from]; i++){
	    int a = encX[from][i];
	    int b = encY[from][i];
	    for(int k=0; k<pachi[to]; k++){
		int c = encX[to][k];
		int d = encY[to][k];
		int w = Math.abs(a-c)+Math.abs(b-d);
		dp[to][k] = Math.min(dp[to][k], dp[from][i]+w);
		//System.out.println(from+" "+to+" "+dp[to][k]);
	    }
	}
    }
    
    void input(){
	pachi = new int[5];
	encX = new int[5][1000];
	encY = new int[5][1000];
	for(int i=0; i<5; i++){
	    Arrays.fill(encX[i], MAX);
	    Arrays.fill(encY[i], MAX);
	}
	ans = MAX;
	num = -1;
	for(int i=0; i<y; i++){
	    s = sc.next();
	    for(int k=0; k<x; k++){
		String t = s.substring(k, k+1);
		if(t.equals("S")){
		    sx = k;
		    sy = i;
		}
		else if(t.equals("G")){
		    gx = k;
		    gy = i;
		}
		else if(t.equals("."))
		    ;
		else {
		    int a = Integer.parseInt(t)-1;
		    pachi[a]++;
		    int c = 0;
		    while(encX[a][c]!=MAX)c++;
		    encX[a][c] = k;
		    encY[a][c] = i;
		}
	    }
	}
    }
}