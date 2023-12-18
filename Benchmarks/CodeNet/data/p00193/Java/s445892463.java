import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	//ライバル社
	void color(int xy[][],int n,int m){
		int num = 1;
		while(true){
			int cnt = 0;
			for(int i = 1;i < n+1;i++){
				for(int j = 1;j < m+1;j++){
					if(xy[i][j] == num){
						if(xy[i+1][j] == 0){
							xy[i+1][j] = num + 1;
							cnt++;
						}
						if(xy[i-1][j] == 0){
							xy[i-1][j] = num + 1;
							cnt++;
						}
						if(xy[i][j+1] == 0){
							xy[i][j+1] = num + 1;
							cnt++;
						}
						if(xy[i][j-1] == 0){
							xy[i][j-1] = num + 1;
							cnt++;
						}
						if(i % 2 == 0){
							if(xy[i+1][j+1] == 0){
								xy[i+1][j+1] = num + 1;
								cnt++;
							}
							if(xy[i-1][j+1] == 0){
								xy[i-1][j+1] = num + 1;
								cnt++;
							}
						}else if(i % 2 == 1){
							if(xy[i+1][j-1] == 0){
								xy[i+1][j-1] = num + 1;
								cnt++;
							}
							if(xy[i-1][j-1] == 0){
								xy[i-1][j-1] = num + 1;
								cnt++;
							}
						}
					}
				}
			}
			if(cnt == 0)break;
			num++;
		}
	}
	//自社
	int Map(int xy[][],int n,int m){
		int num = 1;
		int result = 0;
		while(true){
			int cnt = 0;
			for(int i = 1;i < n+1;i++){
				for(int j = 1;j < m+1;j++){
					if(xy[i][j] == num*(-1)){
						if(xy[i+1][j] > num+1){
							xy[i+1][j] = num*(-1) - 1;
							cnt++;
						}
						if(xy[i-1][j] > num+1){
							xy[i-1][j] = num*(-1) - 1;
							cnt++;
						}
						if(xy[i][j+1] > num+1){
							xy[i][j+1] = num*(-1) - 1;
							cnt++;
						}
						if(xy[i][j-1] > num+1){
							xy[i][j-1] = num*(-1) - 1;
							cnt++;
						}
						if(i % 2 == 0){
							if(xy[i+1][j+1] > num+1){
								xy[i+1][j+1] = num*(-1) - 1;
								cnt++;
							}
							if(xy[i-1][j+1] > num+1){
								xy[i-1][j+1] = num*(-1) - 1;
								cnt++;
							}
						}else if(i % 2 == 1){
							if(xy[i+1][j-1] > num+1){
								xy[i+1][j-1] = num*(-1) - 1;
								cnt++;
							}
							if(xy[i-1][j-1] > num+1){
								xy[i-1][j-1] = num*(-1) - 1;
								cnt++;
							}
						}
					}
				}
			}
			if(cnt == 0)break;
			num++;
		}
		for(int i = 1;i < n+1;i++){
			for(int j = 1;j < m+1;j++){
				if(xy[i][j] < 0)result++;
			}
		}
		return result;
	}
	void doIt() { 
		while(true){
			int ans = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n+m == 0)break;
			int xy[][] = new int [n+2][m+2];
			int num = sc.nextInt();
			for(int i = 0;i < num;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				xy[y][x] = 1;
			}
			color(xy,n,m);
			int map[][] = new int [n+2][m+2];
			int s = sc.nextInt();
			for(int k = 0;k < s;k++){
				for(int i = 1;i < n+1;i++){
					for(int j = 1;j < m+1;j++){
						map[i][j] = xy[i][j];
					}
				}
				int xm = sc.nextInt();
				int ym = sc.nextInt();
				map[ym][xm] = -1;
				if(k == 0){
					ans = Map(map,n,m);
				}else{
					if(ans < Map(map,n,m)){
						ans = Map(map,n,m); 
					}
				}
			}
			System.out.println(ans);
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}