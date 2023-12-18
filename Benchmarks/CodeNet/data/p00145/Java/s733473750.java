import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int DP(int n,int st[][],int ed[][]){
		int xy[][] = new int [n+1][n+1];
		for(int i = 2;i < n+1;i++){
			for(int j = 2;j < i+1;j++){
				int cnt = 0;
				for(int k = 1;k < j;k++){
					if(k == 1){
						xy[i][j] = st[i-k][j-k]*ed[i-k][j-k]*st[i][k]*ed[i][k]+xy[i-k][j-k]+xy[i][k];
					}else{
						cnt = st[i-k][j-k]*ed[i-k][j-k]*st[i][k]*ed[i][k]+xy[i-k][j-k]+xy[i][k];
						if(xy[i][j] > cnt) xy[i][j] = cnt;
					}
				}
			}
		}
		/*
		for(int k = 1;k < n+1;k++){
			for(int l = 1;l < n+1;l++){
				System.out.print(xy[k][l]+" ");
			}
			System.out.println();
		}
		*/
		return xy[n][n];
	}
	void doIt() { 
		int n = sc.nextInt();
		int st[][] = new int [n+1][n+1];
		int ed[][] = new int [n+1][n+1];
		for(int i = 1;i < n+1;i++){
			st[i][1] = sc.nextInt();
			ed[i][1] = sc.nextInt();
		}
		for(int i = 2;i < n+1;i++){
			for(int j = i;j < n+1;j++){
				st[j][i] = st[j-1][i-1];
				ed[j][i] = ed[j][i-1];
			}
		}
		//確認
		/*
		for(int i = 1;i < n+1;i++){
			for(int j = 1;j < n+1;j++){
				System.out.print(st[i][j]);
				//System.out.print(ed[i][j]);
			}
			System.out.println();
		}
		*/
		System.out.println(DP(n, st, ed));
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}