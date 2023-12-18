
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(!(a == 0 && b == 0)){
			int n = sc.nextInt();
			int [][] dis = new int[b+1][a+1];
			//初期値
			for(int i=0; i <= b; i++){
				int set = 0;
				if(i == 0){
					set = 0;
				}
				else {
					set = 1;
				}
				dis[i][0] = 0;
				for(int j = 1; j <= a; j++){
					dis[i][j] = set;
				}
			}
			
			for(int i=0; i  < n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				dis[y][x] = 0;
			}
			
			for(int i=1; i <= b; i++){
				for(int j =1; j <= a; j++){
					if(dis[i][j] == 0){
						continue;
					}
					int left = dis[i][j-1] ;
					int bottom = dis[i-1][j];
					if(i != 1 || j != 1){
						dis[i][j] = left + bottom;
					}
				}
			}
			System.out.println(dis[b][a]);
			
			a = sc.nextInt();
			b = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}