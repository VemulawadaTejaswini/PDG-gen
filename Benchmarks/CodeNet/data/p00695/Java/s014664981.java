import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);
    int ans;
    int[][] map;

    void run(){
	int m = kbd.nextInt();
	while(m>0){
	    solve();
	    m--;
	}
    }

    void solve(){
	ans = 0;
	map = new int[5][5];
	for(int i=0; i<5; i++){
	    for(int j=0; j<5; j++){
		map[i][j] = kbd.nextInt();
	    }
	}
	// テ」ツδ榲」ツδε」ツδ療ヲツコツ姪・ツつ凖」ツ?禿」ツ?禿」ツ?セテ」ツ?ァ

	// テヲツ篠「テァツエツ「テ」ツ?禿」ツ?禿」ツ?凝」ツつ?
	int x=0, y=0, cnt=0;
	for(x=0; x<5; x++){
	    for(y=0; y<5; y++){
		int a = x;
		int b = y;
		for(int i=0; i<5; i++){
		    for(int j=0; j<5; j++){
			cnt = count(a, b, i, j);	
			//System.out.println(cnt+" "+ans);
			if(ans<cnt){
			    ans = cnt;	
			}
			cnt = 0;
		    }
		}
		
	    }
	}
	System.out.println(ans);
    }

    int count(int a, int b, int i, int j){
	boolean tf = true;
	for(int n=0; n<=i; n++){
	    for(int l=0; l<=j; l++){
		if(b+j>=5 || a+i>=5) tf = false;
		else if(map[b+l][a+n]==1){
		    //System.out.println(map[y+j][x+i]);
		}
		else tf = false;
	    }
	}
	if(tf)
	    return (i+1)*(j+1);
	else return -1;
    }
}