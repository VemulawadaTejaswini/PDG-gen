import java.util.*;

public class Main {
	int[][] mapz;
	int[][] map;
	int[] d;
	int[] ans;
	int n, t, f, x, y;
	
	void init(){
		d[0] = 1;
		d[1] = 6;
		d[2] = 3;
		d[3] = 5;
		d[4] = 4;
		d[5] = 2;
		
		if(t==2){
			TR();
		}else if(t==3){
			TF();TF();TF();
		}else if(t==4){
			TF();
		}else if(t==5){
			TR();TR();TR();
		}else if(t==6){
			TF();TF();
		}
		
		while(d[2]!=f) FR();
	}
	
	void TF(){
		int dd = d[0];
		d[0] = d[4];
		d[4] = d[1];
		d[1] = d[2];
		d[2] = dd;
	}
	
	void TR(){
		int dd = d[0];
		d[0] = d[5];
		d[5] = d[1];
		d[1] = d[3];
		d[3] = dd;
	}
	
	void FR(){
		int dd = d[2];
		d[2] = d[5];
		d[5] = d[4];
		d[4] = d[3];
		d[3] = dd;
	}
	
	void func(){
		while(true){
			boolean flag = false;
			for(int i=6;i>=4;i--){
				for(int j=2;j<6;j++){
					if(d[j]==i){
						if(j==2 && mapz[y][x]>mapz[y+1][x]){
							TF();
							y++;
							flag = true;
						}else if(j==3 && mapz[y][x]>mapz[y][x+1]){
							TR();
							x++;
							flag = true;
						}else if(j==4 && mapz[y][x]>mapz[y-1][x]){
							TF();TF();TF();
							y--;
							flag = true;
						}else if(j==5 && mapz[y][x]>mapz[y][x-1]){
							TR();TR();TR();
							x--;
							flag = true;
						}
					}
					if(flag==true){
						i = 0;
						j = 7;
					}
				}	
			}
			if(flag==false){
				ans[map[y][x]]--;
				ans[d[0]]++;
				map[y][x] = d[0];
				mapz[y][x]++;
				break;
			}
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			mapz = new int[2*n+1][2*n+1];
			map = new int[2*n+1][2*n+1];
			d = new int[6];
			ans = new int[7];
			for(int i=0;i<n;i++){
				t = sc.nextInt();
				f = sc.nextInt();
				x = n;
				y = n;
				init();
				func();
			}
			for(int i=1;i<=6;i++){
				if(i!=1) System.out.print(" ");
				System.out.print(ans[i]);
			}
			System.out.println();
		}	
	}
	
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}