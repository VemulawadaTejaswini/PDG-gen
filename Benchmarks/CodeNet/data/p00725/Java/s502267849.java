import java.util.*;

public class Main {
	int w, h, sx, sy, ans;
	int[][] map;
	LinkedList<Integer> x, y;
	
	void loop(int p, int q, int r){
		if(r>=ans || r>=10) return;
		
		for(int i=p-1;i>=0;i--){
			if(map[q][i]==3){
				ans = r+1;
			}else if(map[q][i]==1){
				if(i==p-1){
					break;
				}else{
					map[q][i] = 0;
					x.push(i);
					y.push(q);
					loop(i+1, q, r+1);
					map[y.pop()][x.pop()] = 1;
					break;
				}
			}
		}
		
		for(int i=p+1;i<w;i++){
			if(map[q][i]==3){
				ans = r+1;
			}else if(map[q][i]==1){
				if(i==p+1){
					break;
				}else{
					map[q][i] = 0;
					x.push(i);
					y.push(q);
					loop(i-1, q, r+1);
					map[y.pop()][x.pop()] = 1;
					break;
				}
			}
		}
		
		for(int i=q-1;i>=0;i--){
			if(map[i][p]==3){
				ans = r+1;
			}else if(map[i][p]==1){
				if(i==q-1){
					break;
				}else{
					map[i][p] = 0;
					x.push(p);
					y.push(i);
					loop(p, i+1, r+1);
					map[y.pop()][x.pop()] = 1;
					break;
				}
			}
		}
		
		for(int i=q+1;i<h;i++){
			if(map[i][p]==3){
				ans = r+1;
			}else if(map[i][p]==1){
				if(i==q+1){
					break;
				}else{
					map[i][p] = 0;
					x.push(p);
					y.push(i);
					loop(p, i-1, r+1);
					map[y.pop()][x.pop()] = 1;
					break;
				}
			}
		}
	}

	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) break;
			
			map = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j]==2){
						sx = j;
						sy = i;
					}
				}
			}
			
			x = new LinkedList<Integer>();
			y = new LinkedList<Integer>();
			ans = Integer.MAX_VALUE;
			loop(sx, sy, 0);
			if(ans==Integer.MAX_VALUE) ans = -1;
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}