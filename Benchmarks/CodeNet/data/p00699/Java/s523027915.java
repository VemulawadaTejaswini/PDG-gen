import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- > 0){
			t = new int[5][5];
			int m = 0;
			boolean[] used = new boolean[7];
			boolean trueFlg = true;

			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					t[i][j] = sc.nextInt();

					//ツ督ッツつカツ青板篠堋つェツ出ツづつォツづづ按つ「ツつゥツづ個確ツ認
					if(t[i][j] != 0){
						if(!used[t[i][j]]){
							m++;
							used[t[i][j]] = true;
						}
						else{
							trueFlg = false;
						}
					}
				}
			}
			if(m != 6) trueFlg = false;

			//ツサツイツコツδ債づ青ャツ猟ァツつオツづつ「ツづゥツつゥツづ個確ツ認
			if(trueFlg){
				int sy=-1,sx=-1;
				for(sy=0;sy<5;sy++){
					for(sx=0;sx<5;sx++) if(t[sy][sx] != 0) break;
					if(sx != 5) break;
				}

				Dice d = new Dice(0,0,0,0,0,0);
				makeDice(d,sx,sy);
				trueFlg = d.isDice();
			}

			System.out.println(trueFlg ? "true" : "false");
		}
	}

	private static int[][] t;
	private static int dx[] = {0,1,0,-1};
	private static int dy[] = {-1,0,1,0};

	private static void makeDice(Dice d,int x,int y){
		d.b = t[y][x];
		t[y][x] = 0;

		for(int i=0;i<4;i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<5 && ny>=0 && ny<5 && t[ny][nx]>0){
				d.move(i);
				makeDice(d,nx,ny);
				d.move((i+2)%4);
			}
		}
	}
}

class Dice{
	int t,b,w,e,n,s;

	Dice(int t,int b,int w,int e,int n,int s){
		this.t = t;
		this.b = b;
		this.w = w;
		this.e = e;
		this.n = n;
		this.s = s;
	}

	boolean isDice(){
		return t+b==7 && w+e==7 && n+s==7;
	}

	void move(int dir){
		Dice d = this.copy();
			
		switch(dir){
		case 0:
			t = d.s;
			b = d.n;
			n = d.t;
			s = d.b;
			break;
		case 1:
			t = d.w;
			b = d.e;
			w = d.b;
			e = d.t;
			break;
		case 2:
			t = d.n;
			b = d.s;
			n = d.b;
			s = d.t;
			break;
		case 3:
			t = d.e;
			b = d.w;
			w = d.t;
			e = d.b;
			break;
		}
	}

	Dice copy(){
		return new Dice(t,b,w,e,n,s);
	}
}