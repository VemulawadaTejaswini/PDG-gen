import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	final int INF = 1 << 24;
	C [] data;
	class C{
		int x,y,r,c;
		public C(int x, int y, int r, int c) {
			this.x = x;
			this.y = y;
			this.r = r;
			this.c = c;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner (System.in);
		int n,len,ans;
		//boolean [][] dp = new boolean[1 << 24][13];
		ArrayList<ArrayList<Integer>> dp2 = new ArrayList<ArrayList<Integer>>();
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			data = new C[n];
			for(int i=0; i < n; i++){
				data[i] = new C(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			len = 1 << n;
			dp2.clear();
			for(int i=0; i < n / 2 + 1; i++){
				dp2.add(new ArrayList<Integer>());
			}
			dp2.get(0).add(0);
			ans = 0;
			for(int i=0; i < n/2;i++){
				for(int j: dp2.get(i)){
					for(int k = 0; k < n; k++){
						if((j & (1 << k)) != 0) continue;
						for(int l = k+1; l < n; l++){
							if((j & (1 << k)) != 0) continue;
							if(! issameC(k,l)) continue;
							if(isOVL(k,j) || isOVL(l,j)) continue;
							int num;
							num = j | (1 << k);
							num = num | (1 << l);
							dp2.get(i+1).add(num);
							ans = (i+1)*2;
						}
					}
				}
			}
//			//TODO debug
//			for(int i= 0; i < len; i++){
//				for(int j = 0; j < n+1; j++){
//					if(dp[i][j]){
//						System.out.print("1 ");
//					}
//					else{
//						System.out.print("0 ");
//					}
//				}
//				System.out.println();
//			}
			//System.out.print("ANS= ");
			System.out.println(ans);
		}
	}
	
	private boolean isOVL(int a,int num) {
		if(a == 0) return false;
		int ax = data[a].x;
		int ay = data[a].y;
		int ar= data[a].r;
		int ix,iy,ir,rr;
		double dis;
		for(int i = a-1; i >= 0; i--){
			if(((1 << i) & num) != 0) continue;
			ix = data[i].x;
			iy = data[i].y;
			ir = data[i].r;
			dis = Point2D.Double.distance(ax, ay, ix, iy);
			rr = ir + ar;
			if(dis < rr)return true;
		}
		return false;
	}

	private boolean issameC(int a, int b) {
		if(data[a].c == data[b].c) return true;
		return false;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}