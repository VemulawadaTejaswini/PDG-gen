import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int x, y;
    int[][] map;
    int[][] encX; // テァツィツョテゥツ。ツ?x
    int[][] encY; // テァツィツョテゥツ。ツ?y
    int[] dp;
    int[] pachi;
    int p, gp;
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
		dp = new int[5];
		for(int k=0; k<y; k++)
		    Arrays.fill(dp, MAX);
		p = i;
		gp = p; // テ」ツ?禿」ツ?禿」ツ?ォテヲツ按サテ」ツ?」テ」ツ?淌」ツつ嘉」ツ?甘」ツ?療」ツ?セテ」ツ??
		p++; // テヲツャツ。テ」ツ?ォテヲツ債陛」ツ?セテ」ツ?暗」ツつ凝ッツシツ?
		int dis = search(sx, sy, p, 0);
		if(ans>dis){
		    ans = dis;
		    num = p;
		}
	    }
	    
	    System.out.println(ans!=MAX ?
			       (num+" "+ans) : "NA");
	}
    }

    int search(int x, int y, int p, int sum){
	//System.out.println("*"+gp+" "+x+" "+y+" "+p+" "+sum);
	if(p==5) p=0;
	if(p==gp) return sum+Math.abs(x-gx)+Math.abs(y-gy);
	if(pachi[p]==0) return MAX;
	int[] f = new int[pachi[p]];
	Arrays.fill(f, MAX);
	for(int i=0; i<pachi[p]; i++){
	    int a = encX[p][i];
	    int b = encY[p][i];
	    int w = Math.abs(a-x)+Math.abs(b-y);	    
	    dp[p] = Math.min(dp[p], search(a, b, p+1, sum+w));
	}
	return dp[p]; 
    }

    void input(){
	map = new int[y][x];
	pachi = new int[5];
	encX = new int[5][1000];
	encY = new int[5][1000];
	for(int i=0; i<5; i++){
	    Arrays.fill(encX[i], MAX);
	    Arrays.fill(encY[i], MAX);
	}
	ans = MAX;
	num = MAX;
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
		    map[i][k] = a;
		    int c = 0;
		    while(encX[a][c]!=MAX)c++;
		    encX[a][c] = k;
		    encY[a][c] = i;
		}
	    }
	}
    }
}
			
       